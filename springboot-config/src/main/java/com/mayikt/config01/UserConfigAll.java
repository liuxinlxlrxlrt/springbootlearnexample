package com.mayikt.config01;


import com.config02.UserConfig03;
import com.config02.UserConfig04;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {UserConfig03.class, UserConfig04.class})
public class UserConfigAll {
}
