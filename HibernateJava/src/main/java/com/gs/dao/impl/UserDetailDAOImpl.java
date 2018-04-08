package com.gs.dao.impl;

import com.gs.bean.UserDetail;
import com.gs.dao.HibernateDAO;
import com.gs.dao.UserDetailDAO;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Master on 2017/7/21.
 */
public class UserDetailDAOImpl extends HibernateDAO implements UserDetailDAO {
    public UserDetail queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        UserDetail userDetail = session.get(UserDetail.class, 1);
        session.close();
        return userDetail;
    }

    public void add(UserDetail userDetail) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        session.save(userDetail);
        session.close();
    }

    public void remove(UserDetail userDetail) {

    }

    public void update(UserDetail userDetail) {

    }

    public List<UserDetail> queryAll() {
        return null;
    }
}
