package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    //@Select("select * from mybatis.teacher where id = #{tid}")
    public Teacher getTeacher(int tid);
}
