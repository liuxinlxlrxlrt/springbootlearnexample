package com.example.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
public class UserValue {
    @Value("${user.id}")
    private Integer id;
    @Value("${user.last-name}")
    private String lastName;
    @Value("${user.strs}")
    private String[] strs;
    @Value("${user.age}")
    private Integer age;
    @Value("${user.birth}")
    private Date birth;
    @Value("${user.lists}")
    private List<String> lists;

    @Value("${user.sets}")
    private Set<String> sets;

    /**
     * 不支持复杂类型属性Map,person对象的获取
     */
    private Map<String,String> maps;
    private Person person;
}

