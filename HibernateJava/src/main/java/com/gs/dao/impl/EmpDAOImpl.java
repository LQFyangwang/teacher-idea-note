package com.gs.dao.impl;

import com.gs.bean.Emp;
import com.gs.dao.EmpDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Master on 2017/7/24.
 */
public class EmpDAOImpl extends HibernateDAO implements EmpDAO {
    public Emp queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Emp emp = session.get(Emp.class, integer);
        // session.close();
        return emp;
    }

    public void add(Emp emp) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        session.save(emp);
        session.close();
    }

    public void remove(Emp emp) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(emp);
        transaction.commit();
        session.close();
    }

    public void update(Emp emp) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(emp);
        transaction.commit();
        session.close();
    }

    public List<Emp> queryAll() {
        return null;
    }
}
