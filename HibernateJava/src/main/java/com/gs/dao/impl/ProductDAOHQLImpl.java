package com.gs.dao.impl;

import com.gs.bean.Product;
import com.gs.dao.HibernateDAO;
import com.gs.dao.ProductDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/7/20.
 */
public class ProductDAOHQLImpl extends HibernateDAO implements ProductDAO {
    public Product queryById(Integer integer) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Product p where p.id = ?");
        query.setParameter(0, integer);
        Object obj = query.uniqueResult(); // 返回单个结果
        session.close();
        return obj != null ? (Product) obj : null;
    }

    public void add(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        session.save(product);
        session.close();
    }

    /**
     * HQL不适合做删除操作
     * @param product
     */
    public void remove(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from Product where id = ?");
        query.setParameter(0, product.getId());
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    /**
     * HQL不适合做更新操作
     * @param product
     */
    public void update(Product product) {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("update Product set name = ?, price = ? where id = ?");
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
        Query query = session.createQuery("from Product p");
        List<Product> products = query.list();
        session.close();
        return products;
    }

    public List<Object[]> queryAll1() {
        getSessionFacotry();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select name, price from Product");
        List<Object[]> products = query.list(); // 此对象存储每一行记录查询出的字段object[0] name， object[1] price
        session.close();
        return products;
    }
}
