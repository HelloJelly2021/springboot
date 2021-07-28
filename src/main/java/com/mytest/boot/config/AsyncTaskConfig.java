package com.mytest.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncTaskConfig implements AsyncConfigurer {
    @Override
    @Bean(name = "taskExecutor")
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 最小线程数(核心线程数)
        taskExecutor.setCorePoolSize(4);
        // 最大线程数
        taskExecutor.setMaxPoolSize(8);
        // 等待队列(队列最大长度)
        taskExecutor.setQueueCapacity(16);
        taskExecutor.setThreadNamePrefix("test-");
        //taskExecutor.initialize();
        return taskExecutor;
    }

}
