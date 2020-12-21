package com.mayikt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @Value("${mayikt.name}")
    private String name;
    @Value("${mayikt.age}")
    private String age;

    @RequestMapping("/getProperties")
    public String getPerties(){
        return name+"..."+age;
    }



}
