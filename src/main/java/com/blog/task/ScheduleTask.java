package com.blog.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    private int count = 0;
    @Scheduled(cron = "*/10 * * * * ?")
    private void run(){
        System.out.println("run times: " + (count++));
    }
}
