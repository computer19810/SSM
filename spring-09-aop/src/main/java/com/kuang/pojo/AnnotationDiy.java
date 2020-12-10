package com.kuang.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@SuppressWarnings("ALL")
@Aspect
public class AnnotationDiy {
    @Before("execution(* com.kuang.pojo.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解方式，的方法执行前");
    }
    @After("execution(* com.kuang.pojo.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("注解方式，的方法执行后");
    }
    @Around("execution(* com.kuang.pojo.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕方法执行");
    }
}
