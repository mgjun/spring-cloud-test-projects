package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengj on 2018/4/2.
 */
@RestController
public class TestController {

    @Value("${profile}")
    private String getCurrentProfile;

    @GetMapping("/profile")
    public String home() {
        return getCurrentProfile;
    }


}
