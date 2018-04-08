package com.gs.test;

import com.gs.bean.Dept;
import com.gs.bean.Emp;
import com.gs.dao.EmpDAO;
import com.gs.dao.impl.EmpDAOImpl;

/**
 * Created by Master on 2017/7/24.
 */
public class EmpDAOTest1 {

    public static void main(String... args) {
        EmpDAO empDAO = new EmpDAOImpl();
        Emp emp = new Emp();
        Dept d = new Dept();
        d.setId(1);
        emp.setDept(d);
        emp.setName("zhangsan");
        emp.setJob("ui");
        empDAO.add(emp);

    }

}
