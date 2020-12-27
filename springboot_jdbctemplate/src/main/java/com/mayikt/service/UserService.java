package com.mayikt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/insertUser")
    public String insertUset(String userName,Integer age){
        String insertSql ="insert into users values(null,?,?)";
        int insert = jdbcTemplate.update(insertSql,userName,age);
        return insert>0?"success":"fail";
    }
}
