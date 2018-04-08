package com.gs.bean;

import java.util.Set;

/**
 * Created by Master on 2017/7/27.
 */
public class Teacher {
    private int id;
    private String name;
    private String subject;

    private Set<Stu> stus;

    private Set<Class> classes;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Set<Stu> getStus() {
        return stus;
    }

    public void setStus(Set<Stu> stus) {
        this.stus = stus;
    }

    public Set<Class> getClasses() {
        return classes;
    }

    public void setClasses(Set<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
