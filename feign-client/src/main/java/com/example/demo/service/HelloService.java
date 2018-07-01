package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mengj on 2018/4/1.
 */
@FeignClient(value = "ribbon-service")
public interface HelloService {

    @GetMapping(value = "/hi")
    String hello();
}
