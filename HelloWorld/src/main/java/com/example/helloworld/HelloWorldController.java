package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloWorldController {

    @GetMapping("/get")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/get1")
    public String hello1() {
        return "Hello bridgelabzs";

    }
}
