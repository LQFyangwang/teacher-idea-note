package com.gs.controller;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 2017/6/29.
 */
public class JSONAction extends ActionSupport {

    public String name;
    public int id;
    public List<String> arr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    public String execute() {
        name = "test";
        id = 10;
        arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        return SUCCESS;
    }
}
