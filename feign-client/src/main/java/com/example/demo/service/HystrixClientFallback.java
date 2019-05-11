package com.example.demo.service;

public class HystrixClientFallback implements HelloService {
    @Override
    public String hello() {
        return "some error";
    }

    @Override
    public String postTest(String id) {
        return "post test cause some error for " + id;
    }
}