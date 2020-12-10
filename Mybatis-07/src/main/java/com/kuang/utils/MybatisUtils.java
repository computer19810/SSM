package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtils {

    public static SqlSessionFactory sqlSessionFactory;
    static
    {
        try {
            String inputStream = "mybatis-config.xml";
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlsession()
    {
        return sqlSessionFactory.openSession();
    }
}
