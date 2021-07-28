package com.mytest.boot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LogAnnotationPointcut {
    @Pointcut("@annotation(com.mytest.boot.annotation.InsertLog)")
    public void insertLogPointcut(){}

    @Pointcut("@annotation(com.mytest.boot.annotation.DeleteLog)")
    public void deleteLogPointcut(){}

    @Pointcut("@annotation(com.mytest.boot.annotation.UpdateLog)")
    public void updateLogPointcut(){}

    @After("insertLogPointcut()")
    public void logInsert(JoinPoint jp){
        Object[] args = jp.getArgs();
        log.info("新增数据：" + args[0].toString());
    }

    @After("deleteLogPointcut()")
    public void logDelete(JoinPoint jp){
        Object[] args = jp.getArgs();
        log.info("删除数据：" + args[0].toString());
    }

    @After("updateLogPointcut()")
    public void logUpdate(JoinPoint jp){
        Object[] args = jp.getArgs();
        log.info("更新数据：" + args.toString());
    }
}
