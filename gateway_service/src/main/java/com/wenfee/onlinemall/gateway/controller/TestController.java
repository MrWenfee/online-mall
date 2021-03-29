package com.wenfee.onlinemall.gateway.controller;

import com.wenfee.onlinemall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: online-mall
 * @author: Mr.Wenfee
 * @create: 2021-03-18 16:30
 **/
@RestController
@Slf4j
public class TestController {

    @GetMapping("/baidu")
    public R testBaidu() {
        log.warn("====> 访问 /baidu 接口");
        return R.ok().put("baidu", "成功访问");
    }
}