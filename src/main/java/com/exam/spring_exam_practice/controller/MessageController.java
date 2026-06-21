package com.exam.springexampractice.controller;

import com.exam.springexampractice.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable String name){
        return messageService.getMessage(name);
    }

}