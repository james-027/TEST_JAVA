package com.exam.springexampractice.service;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service
@Primary
public class EmailNotificationService implements NotificationService{

        @Override
        public String send(String name){
            return "Email sent";
        }

}