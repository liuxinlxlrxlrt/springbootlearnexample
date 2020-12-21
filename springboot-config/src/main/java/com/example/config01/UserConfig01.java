package com.example.config01;

import com.example.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig01 {

    @Bean("user1")
    public User getUser01() {
        return new User(1,"小明",21);
    }
}