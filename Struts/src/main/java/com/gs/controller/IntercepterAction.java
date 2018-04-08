package com.gs.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Master on 2017/6/26.
 */
public class IntercepterAction extends ActionSupport {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String execute() {
        System.out.println("test: " + test );
        return SUCCESS;
    }
}
