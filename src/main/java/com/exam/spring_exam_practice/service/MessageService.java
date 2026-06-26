package com.exam.springexampractice.service;

import com.exam.springexampractice.dto.MessageResponse;
import com.exam.springexampractice.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }


    public MessageResponse getMessage(String name) {
        return new MessageResponse(messageRepository.getMessage(), name);
    }
}