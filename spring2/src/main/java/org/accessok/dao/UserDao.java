package org.accessok.dao;

import org.springframework.stereotype.Component;

//标识当前类交给spring去new，交给spring进行管理。
@Component
public class UserDao implements IUserDao {
    @Override
    public void queryUser(){
        System.out.println("queryUser");
    }
}
