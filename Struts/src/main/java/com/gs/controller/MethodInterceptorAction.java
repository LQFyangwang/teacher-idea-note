package com.gs.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Master on 2017/6/26.
 */
public class MethodInterceptorAction extends ActionSupport {

    public String add() {
        return "add";
    }

    public String plus() {
        return "plus";
    }

    public String hello() {
        return "hello";
    }
}
