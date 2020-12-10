package com.kuang.pojo;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Logs implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getClass().getName() + "的类的" + method.getName() +"的方法");
    }
}
