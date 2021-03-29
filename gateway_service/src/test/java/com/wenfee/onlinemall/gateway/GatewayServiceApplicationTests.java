package com.wenfee.onlinemall.gateway;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class GatewayServiceApplicationTests {

    @Test
    public void contextLoads() {

        String url = "/service-name/path/list";
        String s = StringUtils.substringBetween(url, "/");
        System.out.println("StringUtils.substringBetween ====> " + s);
    }

}
