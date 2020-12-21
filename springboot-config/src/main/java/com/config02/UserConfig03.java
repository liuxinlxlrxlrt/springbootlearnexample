package com.config02;

import com.mayikt.entity.User;
import org.springframework.context.annotation.Bean;

public class UserConfig03 {

    @Bean("user3")
    public User getUser03() {
        return new User(3,"小明",23);
    }
}