package com.gs.controller;

import com.gs.bean.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Master on 2017/6/27.
 */
public class OGNLAction extends ActionSupport {

    private int age;
    private String name;
    private User user;

    private List<User> users;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String execute() {
        age = 20;
        name = "test";
        user = new User();
        user.setGender("Ma");
        user.setEmail("abc@qq.com");
        User user1 = new User();
        user1.setGender("Female");
        user1.setEmail("abcd@qq.com");
        user1.setBirthday(Calendar.getInstance().getTime());
        users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        return SUCCESS;
    }
}
