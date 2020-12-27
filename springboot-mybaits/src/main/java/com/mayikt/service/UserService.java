package com.mayikt.service;

import com.mayikt.entity.UserEntity;
import com.mayikt.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserService {
//    private Logger logger =LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserEntity userEntity;

    /**
     * mybatis查询
     * @param id
     * @return
     */
    @RequestMapping("/mybatisfindbyId")
    public UserEntity mybatisfindbyId(Integer id){
        UserEntity userEntity = userMapper.selectByUserId(id);
        return userEntity;
    }

    /**
     *mybatis插入
     * @param userName
     * @param age
     * @return
     */
    @RequestMapping("/insertUserMybatis")
    public String insertUserMybatis(String userName,Integer age){
        int insert = userMapper.insert(userName, age);
        return insert>0?"success":"fail";
    }

    /**
     * @ConfigurationProperties(prefix = "user")
     * @return
     */
    @RequestMapping("/getNameAndAgeAddress")
    public String getNameAndAgeAddress(){
        return userEntity.toString();
    }

    @RequestMapping("/getName")
    public String getName(String nameName,Integer age){
        log.info("nameName{},age{}:",nameName,age);
//        log.debug("这个debug日志");
//        try {
//
//        }catch (Exception e){
//            log.error();
//        }
        return nameName;
    }
}
