package com.kuang.dao;

import com.kuang.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserListUser();

    List<User> getUserListUserById(int id);
    List<User> getUserListUserlike(String value);

    int insertUser(User user);

    int insertUser2(Map<String, Object> map);
    int deleteUser(int id);

    int updateUser(User user);
}


