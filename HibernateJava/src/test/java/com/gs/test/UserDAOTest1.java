package com.gs.test;

import com.gs.bean.User;
import com.gs.bean.UserDetail;
import com.gs.dao.UserDAO;
import com.gs.dao.impl.UserDAOImpl;

/**
 * Created by Master on 2017/7/19.
 */
public class UserDAOTest1 {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.queryById(1);
        System.out.println(user);
        System.out.println(user.getUserDetail());

        User u = new User();
        u.setName("李白");
        u.setPwd("123456");
        UserDetail ud = new UserDetail();
        ud.setAddress("北京");
        u.setUserDetail(ud);
        ud.setUser(u);
        userDAO.add(u);

        User u1 = new User();
        u1.setId(7);
        u1.setName("7_name");
        u1.setPwd("123456");
        UserDetail ud1 = new UserDetail();
        ud1.setId(u1.getId()); // 如果没有设置id，则hibernate会创建一条新记录。如果指明了id，则hibernate则会更新记录
        ud1.setAddress("ganzhou");
        u1.setUserDetail(ud1);
        ud1.setUser(u1);
        userDAO.update(u1);

        User u2 = new User();
        u2.setId(7);
        userDAO.remove(u2);
    }
}
