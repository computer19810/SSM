package com.kuang.pojo;

import com.kuang.pojo.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("Add One User.....");
    }

    @Override
    public void delete() {
        System.out.println("Delete One User....");
    }

    @Override
    public void select() {
        System.out.println("Select One User.....");
    }

    @Override
    public void update() {
        System.out.println("Update One user");

    }
}
