package com.gs.dao.impl;

import com.gs.bean.Product;
import com.gs.dao.HibernateDAO;
import com.gs.dao.ProductDAOSQL;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 2017/7/20.
 */
public class ProductDAOSQLImpl extends HibernateDAO implements ProductDAOSQL {
    public Product queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createNativeQuery("select * from t_product where id = ?");
        query.setParameter(1, integer);
        Object obj = query.uniqueResult(); // 返回的结果是每一行记录的字段所组成的数组
        Product p = null;
        if (obj != null) {
            Object[] objArray = (Object[]) obj;
            p = new Product();
            p.setId((Integer) objArray[0]);
            p.setName((String) objArray[1]);
            p.setPrice((Double) objArray[2]);
        }
        session.close();
        return p;
    }

    public void add(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createNativeQuery("insert into t_product(name, price) values(?, ?)");
        query.setParameter(1, product.getName());
        query.setParameter(2, product.getPrice());
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    /**
     * @param product
     */
    public void remove(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createNativeQuery("delete from t_product where id = ?");
        query.setParameter(1, product.getId());
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    /**
     * @param product
     */
    public void update(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createNativeQuery("update t_product set name = ?, price = ? where id = ?");
        query.setParameter(0, product.getName());
        query.setParameter(1, product.getPrice());
        query.setParameter(2, product.getId());
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    public List<Product> queryAll() {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createNativeQuery("select * from t_product");
        List<Object[]> objects = query.list();
        List<Product> products = new ArrayList<Product>();
        for (Object[] objArray : objects) {
            Product p = new Product();
            p.setId((Integer) objArray[0]);
            p.setName((String) objArray[1]);
            p.setPrice((Double) objArray[2]);
            products.add(p);
        }
        session.close();
        return products;
    }
}
