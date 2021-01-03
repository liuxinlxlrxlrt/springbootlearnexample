package com.mayikt.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mayikt.entity.UserEntity;
import com.mayikt.mapper.UserMapper;

@RestController
//@Slf4j
public class UserService {
    private Logger log = LoggerFactory.getLogger(UserService.class);

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

    /**
     * 演示打印日志
     * @param userName
     * @param age
     * @return
     */
    @RequestMapping("/getName")
    public String getName(String userName,Integer age){
//        log.info("userName:{},age:{}",userName,age);
//        log.debug("这个debug日志");
//        try {
//            int i =age/0;
//        }catch (Exception e){
//            log.error(e.toString());
//        }
        return userName;
    }

    /**
     * 演示系统出错
     * @param age
     * @return
     */
    @RequestMapping("/insertUser")
    public int insertUser(Integer age){
        int j=1/age;
        return j;
    }
}
