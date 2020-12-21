package com.config02;

import com.mayikt.entity.User;
import org.springframework.context.annotation.Bean;


public class UserConfig04 {

    @Bean("user4")
    public User getUser04() {
        return new User(4,"小红",24);
    }
}
