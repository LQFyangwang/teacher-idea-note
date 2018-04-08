package com.gs.controller;

import com.gs.bean.User;

/**
 * Created by Master on 2017/6/22.
 */
public class UserAction2 {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String regPage() {
        return "regPage";
    }

    public String reg() {
        System.out.println(user.getEmail() + ", " + user.getPassword() + ", " + user.getGender());
        // 输出birthday信息
        System.out.println(user.getBirthday());
        return "reg";
    }
}
