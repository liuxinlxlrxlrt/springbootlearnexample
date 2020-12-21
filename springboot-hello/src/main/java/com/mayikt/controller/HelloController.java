package com.mayikt.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.mayikt.controller")
public class HelloController {

    @RequestMapping("/index1")
    public String index(){
        return "Mayikt";
    }

    public static void main(String[] args) {
        /**
         * 启动类入口class,默认整合tomcat，端口号8080
         */
        SpringApplication.run(HelloController.class,args);
    }
}
