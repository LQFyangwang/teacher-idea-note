package com.gs.dao.impl;

import com.gs.bean.ArticleView;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleViewDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Master on 2017/8/4.
 */
public class ArticleViewDAOImpl extends HibernateDAO implements ArticleViewDAO {
    @Override
    public ArticleView queryById(String s) {
        return null;
    }

    @Override
    public void add(ArticleView articleView) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(articleView);
        transaction.commit();
        session.close();
    }

    @Override
    public void remove(ArticleView articleView) {

    }

    @Override
    public void update(ArticleView articleView) {

    }

    @Override
    public List<ArticleView> queryAll() {
        return null;
    }

    @Override
    public Pager<ArticleView> queryByPager(Pager<ArticleView> pager) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
