package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser();
    int insertUser(User user);
    int deleteUser(int id);
}
