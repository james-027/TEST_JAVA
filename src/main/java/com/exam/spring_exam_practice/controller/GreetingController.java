package com.exam.springexampractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exam.springexampractice.service.GreetingService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController{

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){

        this.greetingService = greetingService;

    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return greetingService.greet(name);

    }
}

