package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengj on 2018/4/1.
 */
@RestController
public class TestController {


    @Autowired
    private HelloService helloService;


    @GetMapping("/hi")
    public String home() {
        return helloService.hello();
    }


}
