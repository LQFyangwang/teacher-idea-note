package com.gs.test;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.dao.impl.UserDAOImpl;

/**
 * Created by Master on 2017/7/19.
 */
public class UserDAOTest{

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        System.out.println(userDAO.queryById(1)); //

        User user = new User();
        user.setId(2);
        // userDAO.remove(user);

        User user1 = new User();
        user1.setId(4);
        user1.setPwd("654321");
        user1.setName("name");
        user1.setGender("F");
        userDAO.update(user1);
        /**
        User user = new User();
        user.setName("hello");
        user.setPwd("123456");
        userDAO.add(user);
         */
    }
}
