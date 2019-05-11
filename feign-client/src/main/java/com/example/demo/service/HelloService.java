package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by mengj on 2018/4/1.
 */
@FeignClient(value = "ribbon-service", fallback = HystrixClientFallback.class)
public interface HelloService {

    @GetMapping(value = "/hi")
    String hello();


    @PostMapping(value = "/postTest/{id}",consumes = "application/json")
    String postTest(@PathVariable String id);
}



