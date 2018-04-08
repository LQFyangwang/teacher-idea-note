package com.gs.dao.impl;

import com.gs.bean.ArticleType;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleTypeDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleTypeDAOImpl extends HibernateDAO implements ArticleTypeDAO {
    public ArticleType queryById(String s) {
        return null;
    }

    public void add(ArticleType articleType) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(articleType);
        transaction.commit();
        session.close();
    }

    public void remove(ArticleType articleType) {

    }

    public void update(ArticleType articleType) {

    }

    public List<ArticleType> queryAll() {
        Session session = getSession();
        List<ArticleType> articleTypes = session.createQuery("from ArticleType").list();
        // session.close();
        return articleTypes;
    }

    public Pager<ArticleType> queryByPager(Pager<ArticleType> pager) {
        return null;
    }

    public long count() {
        return 0;
    }
}
