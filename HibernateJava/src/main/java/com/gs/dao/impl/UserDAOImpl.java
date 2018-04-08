package com.gs.dao.impl;

import com.gs.bean.User;
import com.gs.dao.HibernateDAO;
import com.gs.dao.UserDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Master on 2017/7/19.
 */
public class UserDAOImpl extends HibernateDAO implements UserDAO {

    public User queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, integer); // 通过主键查询指定的对象
        // User u = session.load(User.class, integer);
        // System.out.println(user);
        // User user = session.load(User.class, integer); // session.load();并不会立即执行，而是等到查询的对象被 使用时才真正执行sql语句
        // session.close();
        return user;
    }

    public void add(User user) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user); // 保存对象到数据库
        transaction.commit();
        session.close();
    }

    public void remove(User user) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user); // update方法只做更新操作，saveOrUpdate方法如果对象已经存在，则更新，如果对象不存在，则保存
        transaction.commit();
        session.close();
    }

    public List<User> queryAll() {
        return null;
    }
}
