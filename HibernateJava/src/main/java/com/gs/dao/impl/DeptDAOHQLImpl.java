package com.gs.dao.impl;

import com.gs.bean.Dept;
import com.gs.dao.DeptDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/7/24.
 */
public class DeptDAOHQLImpl extends HibernateDAO implements DeptDAO {
    public Dept queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Dept where id = :i");
        query.setParameter("i", integer);
        Dept dept = (Dept) query.uniqueResult();
        // session.close();
        return dept;
    }

    public void add(Dept dept) {

    }

    public void remove(Dept dept) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(dept);
        transaction.commit();
        session.close();
    }

    public void update(Dept dept) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(dept);
        transaction.commit();
        session.close();
    }

    public List<Dept> queryAll() {
        return null;
    }
}
