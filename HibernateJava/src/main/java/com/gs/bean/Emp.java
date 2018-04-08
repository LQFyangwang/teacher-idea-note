package com.gs.bean;

/**
 * Created by Master on 2017/7/24.
 */
public class Emp {
    private int id;
    private String name;
    private String job;

    private Dept dept; // 员工关联到部门，一个员工属于一个部门

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
