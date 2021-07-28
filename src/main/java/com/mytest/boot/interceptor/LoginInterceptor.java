package com.mytest.boot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Yangjiali
 * @create 2021-04-16:44 16:44
 */
@Slf4j
public class LoginInterceptor { // implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("LoginInterceptor.preHandle");
//        HttpSession session = request.getSession();
//        String loginUser = (String)session.getAttribute("userName");
//        if(!StringUtils.hasText(loginUser)) {
//            log.info("LoginInterceptor.preHandle.false");
//            request.getRequestDispatcher("/").forward(request, response); //跳转到@GetMapping("/")
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        log.info("LoginInterceptor.postHandle");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("LoginInterceptor.afterCompletion");
//    }
}
