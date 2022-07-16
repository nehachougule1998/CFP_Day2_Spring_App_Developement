package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/hello")
public class HelloWorldController {

    @GetMapping("/get")
    public String hello() {
        return "Hello World";
    }

    //UC1
    @GetMapping("/message")
    public String sayhello() {
        return "Hello bridgelabz";
    }
    
    //UC2
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return " Hello " + name + "!";
    }
}
