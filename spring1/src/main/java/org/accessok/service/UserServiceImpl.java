package org.accessok.service;

import org.accessok.dao.IUserDao;
import org.accessok.dao.UserDao;

public class UserServiceImpl implements IUserService {
    //耦合度过高，每次需要修改
    IUserDao dao = new UserDao();

    @Override
    public void queryUser() {
        //不使用spring的情况下，需要手动new一个对象
        //如果更新该对象，则需要更新所有引用该对象的代码
        dao.getUser();
    }
}
