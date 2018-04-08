package com.gs.dao.impl;

import com.gs.bean.Stu;
import com.gs.dao.HibernateDAO;
import com.gs.dao.StuDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/7/31.
 */
public class StuDAOCriteriaImpl extends HibernateDAO implements StuDAO {

    public Stu queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        // Stu stu = session.get(Stu.class, integer);
        /**
        Query query = session.createQuery("from Stu s where s.id = :id");
        query.setParameter("id", integer);
        query.uniqueResult();
         */
        /**
        Query query = session.createNativeQuery("select * from t_stu where id = ?");
        query.setParameter(1, integer);
        query.uniqueResult();
         */
        Criteria criteria = session.createCriteria(Stu.class); // 基于对象的条件查询
        // 常用的聚合函数Projections.max min avg count sum
        // criteria.set(Projections.max("age")); // 查找的是某个属性的最大值
        // criteria.add(Restrictions.like("name", "%s%")); // 给条件搜索对象添加 like 条件
        // Restrictions类提供了用于条件搜索的方法，like, eq, le, lt, ge, gt, and, or, between, in, isnull, isNotNull, isEmpty
        criteria.add(Restrictions.eq("name", "nine")); // criteria.add(Criterion)
        List<Stu> stus = criteria.list();
        for (Stu stu : stus) {
            System.out.println(stu);
            System.out.println(stu.getClazz());
        }
        session.close();
        return null;
    }

    /**
     * 仅做测试用
     * @return
     */
    public Stu queryById() {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createNamedQuery("queryById");
        query.setParameter("id", 10);
        Stu stu = (Stu) query.uniqueResult();
        // session.close();
        return stu;
    }

    public void add(Stu stu) {

    }

    public void remove(Stu stu) {

    }

    public void update(Stu stu) {

    }

    public List<Stu> queryAll() {
        return null;
    }
}
