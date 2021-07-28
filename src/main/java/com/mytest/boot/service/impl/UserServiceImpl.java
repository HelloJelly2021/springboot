package com.mytest.boot.service.impl;

import com.mytest.boot.bean.User;
import com.mytest.boot.mapper.UserMapper;
import com.mytest.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Future;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    //@Async("taskExecutor")
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
        //log.info(all.toString());
        //return new Future("");
    }
}
