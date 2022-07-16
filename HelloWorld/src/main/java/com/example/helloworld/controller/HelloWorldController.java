package com.example.helloworld.controller;

import com.example.helloworld.entity.User;
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
    //UC3
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return " Hello " + name + "!" ;
    }
    //UC4
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + "" + user.getLastName() + "!";

    }
    //UC5
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + "" + lastName + "!";
    }
}
