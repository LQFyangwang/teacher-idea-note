package com.gs.dao.impl;

import com.gs.bean.Article;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleDAOImpl extends HibernateDAO implements ArticleDAO {
    public Article queryById(String s) {
        return null;
    }

    public void add(Article article) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(article);
        transaction.commit();
        session.close();
    }

    public void remove(Article article) {

    }

    public void update(Article article) {

    }

    public List<Article> queryAll() {
        return null;
    }

    public Pager<Article> queryByPager(Pager<Article> pager) {
        Session session = getSession();
        Query query = session.createQuery("from Article");
        query.setMaxResults(pager.getPageSize());
        query.setFirstResult(pager.getBeginIndex());
        pager.setRows(query.list());
        pager.setTotal(count());
        // session.close();
        return pager;
    }

    public long count() {
        Session session = getSession();
        long count = (Long) session.createQuery("select count(id) from Article").uniqueResult();
        session.close();
        return count;
    }
}
