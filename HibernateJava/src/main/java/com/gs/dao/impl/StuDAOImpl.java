package com.gs.dao.impl;

import com.gs.bean.Stu;
import com.gs.dao.HibernateDAO;
import com.gs.dao.StuDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/7/27.
 */
public class StuDAOImpl extends HibernateDAO implements StuDAO {
    public Stu queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Stu stu = session.get(Stu.class, integer);
        // session.close();
        return stu;
    }

    public void add(Stu stu) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(stu);
        transaction.commit();
        session.close();
    }

    public void remove(Stu stu) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(stu);
        transaction.commit();
        session.close();
    }

    public void update(Stu stu) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("update Stu set name = :name where id = :id");
        query.setParameter("name", stu.getName());
        query.setParameter("id", stu.getId());
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    public List<Stu> queryAll() {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Stu");
        query.setMaxResults(10); // 每页显示的个数
        query.setFirstResult(10);
        List<Stu> stus = query.list();
        session.close();
        return stus;
    }
}
