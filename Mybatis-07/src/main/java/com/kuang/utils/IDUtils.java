package com.kuang.utils;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.UUID;

public class IDUtils {
    public static String getId()
    {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

@Test
public void getIDTest(){
    System.out.println(UUID.randomUUID().toString().replaceAll("-",""));
    System.out.println(IDUtils.getId().toString());
    System.out.println(IDUtils.getId().toString());
    System.out.println(IDUtils.getId().toString());

}

}


