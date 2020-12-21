package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class HelloControlle02 {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        //转发到mayikt,如果不加@ResponseBody，访问时就会报错
        return "mayikt";
    }

    public static void main(String[] args) {
        /**
         * 启动类入口class,默认整合tomcat，端口号8080
         */
        SpringApplication.run(HelloControlle02.class,args);
    }
}
