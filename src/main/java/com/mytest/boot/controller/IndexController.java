package com.mytest.boot.controller;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Yangjiali
 * @create 2021-04-15:47 15:47
 */
@Slf4j
//@Controller
public class IndexController {

    @GetMapping("/")
    public String index(HttpSession session) {
        int i = 1/0;
        log.info("IndexController.index");
        if(null == session.getAttribute("userName")) {
            log.info("userName is null");
            return "redirect:login.html";
        }
        return "redirect:index.html";
    }

    @PostMapping("/login")
    public String login(String userName, String password, HttpServletRequest request) {
        log.info("IndexController.login");
        if(null == userName || null == password) {
            return "redirect:login.html";
        } else if(!"jelly.yang".equals(userName) || !"123456".equals(password)) {
            return "redirect:login.html";
        }
        HttpSession session = request.getSession();
        session.setAttribute("userName", userName);
        log.info("IndexController.login.index");
        return "redirect:index.html";
    }
}
