package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //   userDao = new UserDaoImpl();

    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
