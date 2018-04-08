package com.gs.test;

import com.gs.bean.Stu;
import com.gs.bean.Teacher;
import com.gs.dao.StuDAO;
import com.gs.dao.impl.StuDAOImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Master on 2017/7/27.
 */
public class StuDAOTest {
    public static void main(String[] args) {
        StuDAO stuDAO = new StuDAOImpl();
        Stu stu = new Stu();
        stu.setName("stu1");
        Set<Teacher> teachers = new HashSet<Teacher>();
        Teacher t1 = new Teacher();
        t1.setId(1);
        teachers.add(t1);
        Teacher t2 = new Teacher();
        t2.setId(2);
        teachers.add(t2);
        stu.setTeachers(teachers); // teachers只处理关联关系
        stuDAO.add(stu);

        /**
        Stu s = new Stu();
        s.setId(8);
        stuDAO.remove(s);
         */
        Stu student = stuDAO.queryById(11);
        System.out.println(student);
        Set<Teacher> teachers1 = student.getTeachers();
        for (Teacher t : teachers1) {
            System.out.println(t);
        }
        System.out.println(student.getClazz());

        Stu stuUpdate = new Stu();
        stuUpdate.setId(11);
        stuUpdate.setName("ele");
        stuDAO.update(stuUpdate);

        List<Stu> stus =  stuDAO.queryAll();
        for (Stu s : stus) {
            System.out.println(s);
        }
    }
}
