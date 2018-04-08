package com.gs.controller;

import com.gs.bean.Point;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Master on 2017/6/23.
 */
public class PointAction extends ActionSupport {

    private Point p;
    private int a;
    private String pwd;
    private String conPwd;
    private String phone;
    public void setP(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getConPwd() {
        return conPwd;
    }

    public void setConPwd(String conPwd) {
        this.conPwd = conPwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String execute() {
        System.out.println(p.getX());
        return SUCCESS;
    }
}
