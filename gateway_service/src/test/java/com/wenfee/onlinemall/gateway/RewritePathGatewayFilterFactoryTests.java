package com.wenfee.onlinemall.gateway;

import java.net.URI;
import java.util.LinkedHashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.cloud.gateway.filter.factory.RewritePathGatewayFilterFactory;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.RewritePathGatewayFilterFactory.Config;
import org.springframework.http.HttpMethod;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.mock.web.server.MockServerWebExchange;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR;
import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;

/**
 * @program: online-mall
 * @author: Mr.Wenfee
 * @create: 2021-03-18 16:47
 **/
@RunWith(SpringRunner.class)
public class RewritePathGatewayFilterFactoryTests {

    @Test
    public void rewritePathFilterWorks() {
        testRewriteFilter("/foo", "/baz", "/foo/bar", "/baz/bar");
    }

    @Test
    public void rewriteEncodedPathFilterWorks() {
        testRewriteFilter("/foo", "/baz", "/foo/bar%20foobar", "/baz/bar foobar");
    }

    @Test
    public void rewritePathFilterWithNamedGroupWorks() {
        testRewriteFilter("/foo/(?<id>\\d.*)", "/bar/baz/$\\{id}", "/foo/123", "/bar/baz/123");
    }

    private ServerWebExchange testRewriteFilter(String regex, String replacement, String actualPath,
                                                String expectedPath) {
        GatewayFilter filter = new RewritePathGatewayFilterFactory()
                .apply(c -> c.setRegexp(regex).setReplacement(replacement));

        URI url = UriComponentsBuilder.fromUriString("http://localhost" + actualPath).build(true).toUri();
        MockServerHttpRequest request = MockServerHttpRequest.method(HttpMethod.GET, url).build();

        ServerWebExchange exchange = MockServerWebExchange.from(request);

        GatewayFilterChain filterChain = mock(GatewayFilterChain.class);

        ArgumentCaptor<ServerWebExchange> captor = ArgumentCaptor.forClass(ServerWebExchange.class);
        when(filterChain.filter(captor.capture())).thenReturn(Mono.empty());

        filter.filter(exchange, filterChain);

        ServerWebExchange webExchange = captor.getValue();

        assertThat(webExchange.getRequest().getURI()).hasPath(expectedPath);

        URI requestUrl = webExchange.getRequiredAttribute(GATEWAY_REQUEST_URL_ATTR);
        assertThat(requestUrl).hasScheme("http").hasHost("localhost").hasNoPort().hasPath(expectedPath);
        LinkedHashSet<URI> uris = webExchange.getRequiredAttribute(GATEWAY_ORIGINAL_REQUEST_URL_ATTR);
        assertThat(uris).contains(request.getURI());

        return webExchange;
    }

    @Test
    public void rewritePathWithEncodedParams() {
        ServerWebExchange exchange = testRewriteFilter("/foo", "/baz", "/foo/bar?name=%E6%89%8E%E6%A0%B9", "/baz/bar");

        URI uri = exchange.getRequest().getURI();
        assertThat(uri.getRawQuery()).isEqualTo("name=%E6%89%8E%E6%A0%B9");
    }

    @Test
    public void toStringFormat() {
        Config config = new Config().setRegexp("regexp1").setReplacement("replacement1");
        GatewayFilter filter = new RewritePathGatewayFilterFactory().apply(config);
        assertThat(filter.toString()).contains("regexp1").contains("replacement1");
    }
}