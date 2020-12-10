package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    public Teacher getTeacher(@Param("tid") int tid);

    public Teacher getTeacher2(@Param("tid") int tid);
}
