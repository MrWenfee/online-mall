package com.wenfee.onlinemall.common.config;

import com.google.common.base.Predicate;
import com.wenfee.onlinemall.common.annotation.SwaggerCustomIgnore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.google.common.base.Predicates;

/**
 * @author: Mr.Wenfee
 * @create: 2021-05-15 16:17
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 生成API文档的核心对象，里面配置一些必要的信息
     *
     * @return
     */
    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(webApiInfo())
                .groupName("WebApi")
                .select()
                // 添加过滤条件，谓词过滤predicate，这里是自定义注解进行过滤
                .apis(Predicates.not(RequestHandlerSelectors.withMethodAnnotation(SwaggerCustomIgnore.class)))
                // 添加拒绝路径
                .paths(notPaths())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    private ApiInfo webApiInfo() {
        Contact contact = new Contact("online-mall", "https://swagger.io/", "online-mall@163.com");
        return new ApiInfoBuilder()
                .contact(contact)
                .title("Swagger2构建RESTful API文档")
                .description("RESTful API文档")
                .build();
    }

    /**
     * path 匹配规则：允许路径
     *
     * @return
     */
    private Predicate<String> allowPaths() {
        return Predicates.or(
                PathSelectors.regex("/user.*"),
                PathSelectors.regex("/role.*")
        );
    }

    /**
     * path 匹配规则：拒绝路径
     *
     * @return
     */
    private Predicate<String> notPaths() {
        return Predicates.not(
                PathSelectors.regex("/admin/.*")
        );
    }
}