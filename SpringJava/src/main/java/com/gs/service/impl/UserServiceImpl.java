package com.gs.service.impl;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void remove(String s) {
        userDAO.remove(s);
    }
}
