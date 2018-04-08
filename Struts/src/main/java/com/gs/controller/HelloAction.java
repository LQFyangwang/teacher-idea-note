package com.gs.controller;

/**
 * Created by Master on 2017/6/19.
 */
public class HelloAction {

    public String execute() {
        int a = 15;
        if (a > 10) {
            return "fail";
        }
        return "success";
    }

    public String hello() {
        return "hello";
    }

    public String add() {
        return "add";
    }

    public String plus() {
        return "plus";
    }
}
