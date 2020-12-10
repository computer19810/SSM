package com.kuang;

import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class DaoTest {
    @Test
    public void DaoTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void DaoTest2()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        TeacherMapper TeacherMapper2 = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = TeacherMapper2.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}

