package com.gs.test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.dao.DeptDAO;
import com.gs.dao.impl.DeptDAOHQLImpl;

import java.util.Set;

/**
 * Created by Master on 2017/7/25.
 */
public class DeptDAOHQLTest {

    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAOHQLImpl();

        Dept d = deptDAO.queryById(1);
        System.out.println(d);
        Set<Emp> emps1 = d.getEmps(); // 使用emps
        for (Emp e : emps1) {
            System.out.println(e);
        }
    }
}
