package com.gs.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Master on 2017/6/28.
 */
public class FormAction extends ActionSupport {

    private String name;
    private String des;
    private String gender;
    private String[] hobby;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String post() {
        System.out.println(name + job);
        return "post";
    }

    public String page() {
        name = "test";
        job = "developer";
        hobby = new String[]{"reading"};
        gender = "Male";
        return "page";
    }
}
