package com.exam.springexampractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import com.exam.springexampractice.service.NotificationService;

@RestController
public class NotificationController{

    private final NotificationService notificationService;

    public NotificationController(@Qualifier("smsNotificationService")NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @GetMapping("/notify")
    public String getNotify(@RequestParam String name){
            return notificationService.send(name);
    }


}