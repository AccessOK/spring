package org.accessok.dao;

public class UserDao1 implements IUserDao{
    @Override
    public void getUser() {
        System.out.println("getUser1");
    }
}
