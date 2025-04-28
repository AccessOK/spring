package org.accessok.service;

import org.accessok.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public void queryUser() {
        System.out.println("UserServiceImpl");
        userDao.getUser();
    }
}
