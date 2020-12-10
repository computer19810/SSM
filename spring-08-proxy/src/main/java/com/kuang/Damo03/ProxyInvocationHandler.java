package com.kuang.Damo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    public UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), userService.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(userService, args);
        return null;
    }
    public void log(String msg)
    {
        System.out.println("Print "+msg+" method");
    }
}
