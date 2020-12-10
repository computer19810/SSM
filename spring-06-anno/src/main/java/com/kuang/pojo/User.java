package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// 等价于<bean id = "user" class="com.kuang.pojo.user"/>
@Component
//
public class User {
    //相当于<property name="name" value= "Kuangshen"/>
    @Value("Kuangchen")
    public String name;

}
