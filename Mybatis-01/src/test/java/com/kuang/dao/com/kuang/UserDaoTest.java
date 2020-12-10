package com.kuang.dao.com.kuang;

import com.kuang.dao.com.kuang.dao.UserDao;
import com.kuang.dao.com.kuang.pojo.User;
import com.kuang.dao.com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
//import org.apache.maven.repository.internal.SnapshotMetadataGeneratorFactory;
import org.junit.jupiter.api.Test;

import java.util.*;

public class UserDaoTest {
    @Test
    public void test()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userList= sqlSession.getMapper(UserDao.class);
        List<User> users = userList.getUserListUser();
        for (User user : users) {
            System.out.println(user);

        }
        sqlSession.close();
    }
    @Test
    public void selectTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userList = sqlSession.getMapper(UserDao.class);
        List<User> users = userList.getUserListUserById(2);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void insertTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userList = sqlSession.getMapper(UserDao.class);
        int InsertNum = userList.insertUser(new User(3,"Jerry2","123455444444"));
        if (InsertNum >0)
        {
            System.out.println("Insert successful");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void selectTest2()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getUserListUserlike("j");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();

    }
    @Test
    public void insertTest2()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map =new HashMap<String, Object>();
        map.put("Userid", 7);
        map.put("Username","jackson");
        int InsertNum= userDao.insertUser2(map);
        if (InsertNum >0 )
        {
            System.out.println("Insert Successful");
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userList = sqlSession.getMapper(UserDao.class);
        int deleteNum = userList.deleteUser(4);
        if (deleteNum > 0)
        {
            System.out.println("Delete Successful");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserDao userList = sqlSession.getMapper(UserDao.class);
        int UpdateNum= userList.updateUser(new User(5,"Lilting","55555"));
        if (UpdateNum > 0)
        {
            System.out.println("Update Successful");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
