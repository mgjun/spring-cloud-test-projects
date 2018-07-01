package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengj on 2018/4/2.
 */
@RestController
public class TestController {

    @Value("${democonfigclient.message}")
    private String rabbitPort;

    @GetMapping("/hello")
    public String home() {
        return rabbitPort;
    }


}
