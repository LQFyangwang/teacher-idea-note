package com.gs.bean;

import java.util.Set;

/**
 * Created by Master on 2017/7/24.
 */
public class Dept {
    private int id;
    private String name;

    private Set<Emp> emps; // 一个部门关联到多个员工，一对多

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

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
