package com.exam.springexampractice.controller;

import com.exam.springexampractice.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exam.springexampractice.dto.MessageResponse;
import com.exam.springexampractice.dto.MessageRequest;


@RestController
@RequestMapping("/api")
public class MessageController {

    private final MessageService messageService;
    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }



    @PostMapping("/message")
    public MessageResponse createMessage(@RequestBody MessageRequest request) {
        return messageService.getMessage(request.getName());
    }




}