package com.kuang.Damo01;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("添加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");

    }

    @Override
    public void modify() {
        System.out.println("修改了一个用户");
    }
}
