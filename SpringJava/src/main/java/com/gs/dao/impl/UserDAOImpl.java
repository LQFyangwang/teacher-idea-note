package com.gs.dao.impl;

import com.gs.bean.User;
import com.gs.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("save user");
    }

    @Override
    public void remove(String s) {
        System.out.println("remove user");
    }
}
