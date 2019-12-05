package com.katkov.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerappApplication.class, args);
    }

}
