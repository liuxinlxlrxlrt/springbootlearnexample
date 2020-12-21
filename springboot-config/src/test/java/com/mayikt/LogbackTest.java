package com.mayikt;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *  * 测试日志输出，
 *  * SLF4J 日志级别从小到大trace,debug,info,warn,error
 */
@SpringBootTest
public class LogbackTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLogger(){
        logger.info("info日志。。。");
        logger.trace("trace 日志。。。");
        logger.debug("debug日志。。。");
        logger.warn("warn日志。。。");
        logger.error("error日志");
    }
}
