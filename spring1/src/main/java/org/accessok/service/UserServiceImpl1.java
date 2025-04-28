package org.accessok.service;

import org.accessok.dao.IUserDao;
import org.accessok.dao.UserDao;
import org.accessok.dao.UserDao1;

public class UserServiceImpl1 implements IUserService {

    IUserDao userDao;
    //spring基于属性注入，需要get和set方法
    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void queryUser() {
        userDao.getUser();
    }
}
