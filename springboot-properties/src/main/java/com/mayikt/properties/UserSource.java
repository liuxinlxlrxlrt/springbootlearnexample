package com.mayikt.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix = "user")
public class UserSource {
    private Integer id;
    private String lastName;
    private String[] strs;
    private Integer age;
    private Date birth;
    private List<String> lists;
    private Map<String,String> maps;
    private Set<String> sets;
    private Person person;
}
