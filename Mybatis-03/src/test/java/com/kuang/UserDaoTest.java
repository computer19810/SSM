package com.kuang;

import com.kuang.dao.UserMapper03;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

public class UserDaoTest {
   static Logger logger =  Logger.getLogger(UserDaoTest.class);
    @Test
    public void test()
    {
        logger.info("[********************INFO********************]:进入Test方法");
        logger.debug("[********************INFO********************]:进入debug方法");
        SqlSession sqlSession = MybatisUtils.getSqlSesstion();
        UserMapper03 userList= sqlSession.getMapper(UserMapper03.class);
        List<User> users = userList.getUserListUser();
        for (User user : users) {
            System.out.println(user);

        }
        sqlSession.close();
    }
    @Test
    public void log4jTest()
    {
        logger.info("Info:进入Info模式");
        logger.debug("[Debug]: 进入debug模式");
        logger.error("[Error]:进入Error模式");
    }

}
