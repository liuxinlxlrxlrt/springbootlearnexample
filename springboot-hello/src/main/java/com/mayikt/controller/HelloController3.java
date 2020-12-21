package com.mayikt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController3 {

    @RequestMapping("/index3")
    public String index(){
        return "Mayikt";
    }
}
