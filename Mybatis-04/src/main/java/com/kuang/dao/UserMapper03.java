package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper03 {

    @Select("select * from mybatis.user")
    List<User> getUserListUser();

    @Select("select * from mybatis.user where id = #{id}")
    User  getUserbyId(@Param("id") int id);

    @Insert("insert into mybatis.user (id, name, pwd) values(#{id}, #{name}, #{password})")
    int addUser(@Param("id") int id, @Param("name") String name, @Param("password") String pwd);

    @Update("update mybatis.user set name = #{name} where id = #{id}")
    int updateUser(@Param("name") String name, @Param("id") int id);
}


