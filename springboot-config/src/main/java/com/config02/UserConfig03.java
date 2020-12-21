package com.config02;

import com.example.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class UserConfig03 {

    @Bean("user3")
    public User getUser03() {
        return new User(3,"小明",23);
    }
}