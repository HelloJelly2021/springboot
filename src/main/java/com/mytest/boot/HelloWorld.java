package com.mytest.boot;

import com.mytest.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * @author Yangjiali
 * @create 2021-04-23:55 23:55
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.mytest.boot.mapper")
//@EnableScheduling
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

//    @Resource
//    private TaskExecutor taskExecutor;
//
//    @Resource
//    private UserService userService;
//
//    @Scheduled(fixedRate = 5000)
//    public void schAll() {
//        for (int i = 0; i < 10; i++) {
//            taskExecutor.execute(() -> {
//                log.info("异步开始" + System.currentTimeMillis());
//                userService.findAll();
//                log.info("异步结束" + System.currentTimeMillis());
//            });
//        }
//    }
}
