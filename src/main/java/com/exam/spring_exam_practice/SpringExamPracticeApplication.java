package com.exam.springexampractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.exam.springexampractice.service.MessageService;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringExamPracticeApplication {

    public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(
                SpringExamPracticeApplication.class,
                args
        );
		MessageService service = context.getBean(MessageService.class);
    }
}