package com.gs.test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.dao.DeptDAO;
import com.gs.dao.impl.DeptDAOImpl;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Master on 2017/7/24.
 */
public class DeptDAOTest {

    public static void main(String... args) {
        DeptDAO deptDAO = new DeptDAOImpl();
        Dept dept = new Dept();
        dept.setName("研发部");

        Set<Emp> empsAdd = new HashSet<Emp>();
        Emp e1 = new Emp();
        e1.setName("test");
        e1.setDept(dept);
        empsAdd.add(e1);
        Emp e2 = new Emp();
        e2.setName("hello");
        e2.setDept(dept);
        empsAdd.add(e2);
        dept.setEmps(empsAdd);

        deptDAO.add(dept);

        Dept d = deptDAO.queryById(1);
        System.out.println(d);
        Set<Emp> emps = d.getEmps(); // 使用emps
        for (Emp e : emps) {
            System.out.println(e);
        }

        // 通过一方去更新多方，本身业务逻辑不适用
        // 其次如果要更新多方，则多方的所有数据都必须设置到一方
        Dept dUpdate = new Dept();
        dUpdate.setId(9);
        dUpdate.setName("开发部");
        Emp empUpdate1 = new Emp();
        empUpdate1.setDept(dUpdate);
        empUpdate1.setId(8);
        empUpdate1.setName("new name");
        empUpdate1.setJob("pm");
        Set<Emp> empsUpdate = new HashSet<Emp>();
        empsUpdate.add(empUpdate1);
        dUpdate.setEmps(empsUpdate);
        deptDAO.update(dUpdate);

        // 一对多的级联删除，最好的方案是先删除多方数据，再删除一方数据
        Dept deptDel = new Dept();
        deptDel.setId(10);
        deptDAO.remove(deptDel);

    }

}
