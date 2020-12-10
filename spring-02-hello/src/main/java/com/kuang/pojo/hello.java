package com.kuang.pojo;

public class hello {
    private String str;

    public String getStr() {
        return "Get方法的："+str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello 您好，在么{" +
                "str='" + str + '\'' +
                '}';
    }
}
