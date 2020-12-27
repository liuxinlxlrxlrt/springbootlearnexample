package com.mayikt.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//    @Scheduled(fixedRate = 5000)
//    @Scheduled(cron = "1/3 * * * * ? ")
    public void taskService(){
        System.out.println("定时任务："+dateFormat.format(new Date()));
    }
}
