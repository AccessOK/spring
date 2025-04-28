package org.accessok.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("UserDao");
    }
}
