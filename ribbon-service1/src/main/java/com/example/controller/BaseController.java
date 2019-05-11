package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

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

    @PostMapping("/postTest/{id}")
    public String postTest(@PathVariable String id) {
        return "this is post Ribbon service return " + id;
    }
}
