package com.sparta.nbcamp_java_5th_springprepare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World";
    }
}
