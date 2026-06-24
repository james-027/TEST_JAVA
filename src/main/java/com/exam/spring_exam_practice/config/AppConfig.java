package com.exam.springexampractice.config;

import com.exam.springexampractice.validator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public StaffValidator staffValidator() {
        return new StrictStaffValidator();
        // change to StrictEmployeeValidator to switch behavior
        // return new StrictEmployeeValidator();
    }
}