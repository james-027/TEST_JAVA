package com.exam.springexampractice.service;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements NotificationService{

    @Override
    public String send(String name){
        return "SMS sent " + name ;
    }
}