package com.mayikt;

import com.mayikt.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootConfigApplicationTests {

    @Autowired
    @Qualifier(value = "user4")
    private User user;

    @Test
    void contextLoads() {
        System.out.println(user);
    }
}
