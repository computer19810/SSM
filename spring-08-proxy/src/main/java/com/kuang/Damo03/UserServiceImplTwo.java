package com.kuang.Damo03;

import java.lang.reflect.Proxy;

public class UserServiceImplTwo {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih= new ProxyInvocationHandler();
        pih.setUserService(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        System.out.println("-----------------------------------------------");
        proxy.delete();
        System.out.println("-----------------------------------------------");
        proxy.query();
        System.out.println("-----------------------------------------------");
        proxy.modify();
        System.out.println("-----------------------------------------------");
    }
}
