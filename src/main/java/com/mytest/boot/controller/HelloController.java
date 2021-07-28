package com.mytest.boot.controller;

import com.mytest.boot.annotation.UpdateLog;
import com.mytest.boot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yangjiali
 * @create 2021-04-13:50 13:50
 */
@RestController
public class HelloController {

    @UpdateLog
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
