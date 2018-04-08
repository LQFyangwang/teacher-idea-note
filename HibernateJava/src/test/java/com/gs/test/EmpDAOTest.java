package com.gs.test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.dao.EmpDAO;
import com.gs.dao.impl.EmpDAOImpl;

/**
 * Created by Master on 2017/7/24.
 */
public class EmpDAOTest {

    public static void main(String... args) {
        EmpDAO empDAO = new EmpDAOImpl();
        Emp emp = new Emp();
        Dept d = new Dept();
        d.setId(1);
        emp.setDept(d);
        emp.setName("zhangsan");
        emp.setJob("ui");
        empDAO.add(emp);

        Emp e = empDAO.queryById(15);
        System.out.println(e);
        System.out.println(e.getDept());

        Emp empDel = new Emp();
        empDel.setId(13);
        empDAO.remove(empDel);

        Emp empUpdate = new Emp();
        empUpdate.setName("你好");
        empUpdate.setId(15);
        Dept empDept = new Dept();
        empDept.setId(2);
        empUpdate.setDept(empDept);
        empDAO.update(empUpdate);
    }

}
