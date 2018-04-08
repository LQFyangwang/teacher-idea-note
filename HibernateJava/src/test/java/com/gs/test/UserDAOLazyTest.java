package com.gs.test;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.dao.impl.UserDAOImpl;

/**
 * Created by Master on 2017/7/19.
 */
public class UserDAOLazyTest {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.queryById(1);
        System.out.println(user);
        System.out.println(user.getUserDetail());
    }
}
