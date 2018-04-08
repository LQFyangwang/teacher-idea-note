package com.gs.controller;

/**
 * Created by Master on 2017/6/22.
 */
public class UserAction1 {

    private String phone;
    private String pwd;
    private String[] hobby;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String regPage() {
        return "regPage";
    }

    public String reg() {
        System.out.println(phone + ", " + pwd);
        for (String h : hobby) {
            System.out.println(h);
        }
        return "reg";
    }
}
