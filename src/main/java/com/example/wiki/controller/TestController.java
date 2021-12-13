package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:Test}")
    private String testHello;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World"+testHello;
    }

    @PostMapping("/hello/post")
    public String hello(String name){
        return "hello post" + name;
    }
}
