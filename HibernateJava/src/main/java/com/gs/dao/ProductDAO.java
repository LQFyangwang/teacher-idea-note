package com.gs.dao;

import com.gs.bean.Product;

import java.util.List;

/**
 * Created by Master on 2017/7/20.
 */
public interface ProductDAO extends BaseDAO<Integer, Product> {

    public List<Object[]> queryAll1();
}
