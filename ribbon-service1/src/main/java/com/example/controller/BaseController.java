package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengj on 2018/4/1.
 */
@RestController
public class BaseController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String service;

    @RequestMapping("/hi")
    public String home() {
        return "hi " + service + ",from port:" + port;
    }
}
