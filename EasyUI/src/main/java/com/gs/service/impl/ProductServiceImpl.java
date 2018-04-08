package com.gs.service.impl;

import com.gs.bean.Product;
import com.gs.common.Pager;
import com.gs.dao.ProductDAO;
import com.gs.dao.impl.ProductDAOImpl;
import com.gs.service.ProductService;

import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImpl() {
        this.productDAO = new ProductDAOImpl();
    }

    public void add(Product product) {
        productDAO.add(product);
    }

    public void update(Product product) {
        productDAO.update(product);
    }

    public List<Product> queryAll() {
        return null;
    }

    public Pager<Product> queryByPager(Pager<Product> pager) {
        return productDAO.queryByPager(pager);
    }

    public Product queryById(Integer s) {
        return null;
    }

    public void valid(Integer s, String status) {
        productDAO.valid(s, status);
    }

    public int count() {
        return productDAO.count();
    }
}
