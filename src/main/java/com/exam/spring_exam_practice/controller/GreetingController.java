package com.exam.springexampractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.exam.springexampractice.service.GreetingService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController{

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return greetingService.greet(name);

    }
}

