package com.mayikt.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberServiceAsync {

    @Async("taskExecutor")   //实现异步
    public String sms() {
//        logger.info(">02<");
        log.info(">02<");
        try {
            log.info(">正在发送短信..<");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        logger.info(">03<");
        log.info(">03<");
        return "短信发送完成！";
    }
}
