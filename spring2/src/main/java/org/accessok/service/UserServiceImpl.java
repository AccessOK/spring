package org.accessok.service;

import org.accessok.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//标识当前类交给spring去new，交给spring进行管理。
@Component
public class UserServiceImpl implements IUserService {
    //让spring自动注入，会在spring配置的包路径下查找@Component标注的实现IUserDao接口的类
    @Autowired
    IUserDao userDao;
    @Override
    public void getUser() {
        userDao.queryUser();
    }
}
