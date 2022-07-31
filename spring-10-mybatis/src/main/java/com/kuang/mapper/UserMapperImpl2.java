package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
        //UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        //return mapper.selectUser();
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
