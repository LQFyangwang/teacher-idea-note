package com.gs.test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.dao.DeptDAO;
import com.gs.dao.impl.DeptDAOImpl;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Master on 2017/7/25.
 */
public class DeptDAOTest1 {

    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAOImpl();
        Dept dept = new Dept();
        dept.setName("部门1");

        Set<Emp> emps = new HashSet<Emp>();
        Emp emp1 = new Emp();
        emp1.setName("emp1");
        emp1.setDept(dept);
        emps.add(emp1);
        dept.setEmps(emps);
        deptDAO.add(dept);

        Dept d = deptDAO.queryById(1);
        System.out.println(d);
        /**
        Set<Emp> emps1 = d.getEmps(); // 使用emps
        for (Emp e : emps1) {
            System.out.println(e);
        }
         */
    }
}
