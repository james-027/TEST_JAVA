package com.exam.springexampractice.service;

import com.exam.springexampractice.repository.MessageRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public String getMessage(String name) {
        return "Hello "+ name;
    }
}