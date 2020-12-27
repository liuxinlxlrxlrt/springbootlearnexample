package com.mayikt.service;

import com.mayikt.async.MemberServiceAsync;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberService {

//    private static final Logger logger= LoggerFactory.getLogger(MemberService.class);

    @Autowired
    private MemberServiceAsync memberServiceAsync;

    @RequestMapping("/addMember")
    public String addMember(){
        //1.数据库插入数据
//        logger.info(">01<");
        log.info(">01<");
        //2.发送短信
        memberServiceAsync.sms();
        //修改为新建一个线程来执行sms();发送短信
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sms();
//            }
//        }).start();
        log.info(">04<");
//        logger.info(">04<");
        return "用户注册成功";
    }

//    @Async   //实现异步
//    public String sms() {
////        logger.info(">02<");
//        log.info(">02<");
//        try {
//            logger.info(">正在发送短信..<");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
////        logger.info(">03<");
//        log.info(">03<");
//        return "短信发送完成！";
//    }
}
