package com.kuang.pojo;

import com.kuang.dao.UserDaoMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl2 extends SqlSessionDaoSupport implements UserDaoMapper {

    @Override
    public List<User> getAllUser() {
        return getSqlSession().getMapper(UserDaoMapper.class).getAllUser();
    }
}
