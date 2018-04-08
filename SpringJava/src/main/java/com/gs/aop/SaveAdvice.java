package com.gs.aop;

public class SaveAdvice {

    public void before() {
        System.out.println("before...");
    }

    public void after() {
        System.out.println("after....");
    }

    public void exp() {
        System.out.println("exception...");
    }

}
