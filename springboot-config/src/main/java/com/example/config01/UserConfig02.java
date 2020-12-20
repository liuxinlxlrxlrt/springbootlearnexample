package com.example.config01;

import com.example.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig02 {

    @Bean("user2")
    public User getUser02() {
        return new User(2,"小明",22);
    }
}