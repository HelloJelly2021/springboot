package com.mytest.boot.controller;

import com.mytest.boot.annotation.UpdateLog;
import com.mytest.boot.mapper.UserMapper;
import com.mytest.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@Api(value = "desc of class")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @UpdateLog
    @ApiOperation(value = "find all user", notes = "")
    @GetMapping("/all")
    public String allUser() {
        return userService.findAll().toString();
    }
}
