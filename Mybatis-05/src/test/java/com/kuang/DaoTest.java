package com.kuang;

import com.kuang.dao.StudentMapper;
import com.kuang.dao.TeacherMapper;
import com.kuang.dao.TeacherNameMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.pojo.TeacherName;
import com.kuang.utils.MybatisUtils;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void StudentTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = studentMapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacherTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        TeacherNameMapper teacherNameMapper = sqlSession.getMapper(TeacherNameMapper.class);
        TeacherName teacherName = teacherNameMapper.getTeacherName(1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(teacherName);
        sqlSession.close();
    }
    @Test
    public void getStudentTest2()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        StudentMapper studentMapper2 = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = studentMapper2.getStudent2();
        //System.out.println(student2);
        for (Student student : student2) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
