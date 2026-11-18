package com.spring.learn.config;

import com.spring.learn.dependencyInj.School;
import com.spring.learn.dependencyInj.Teachers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("teacherBean")
    public Teachers teacher() {
        return new Teachers();
    }

}
