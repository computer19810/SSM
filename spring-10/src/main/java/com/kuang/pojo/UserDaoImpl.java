package com.kuang.pojo;

import com.kuang.dao.UserDaoMapper;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDaoMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAllUser() {
        UserDaoMapper mapper = sqlSession.getMapper(UserDaoMapper.class);
        return mapper.getAllUser();
    }

}

