package com.xsh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   //在需要刷新配置的地方使用
public class TestConfigServerController {

    @Value("${age}")
    String age;

    @RequestMapping(value = "/getAge")
    public String getAge() {
        return age;
    }
}
