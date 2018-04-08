package com.gs.test;

import com.gs.bean.Product;
import com.gs.dao.ProductDAOSQL;
import com.gs.dao.impl.ProductDAOSQLImpl;

import java.util.List;

/**
 * Created by Master on 2017/7/19.
 */
public class ProductDAOSQLTest {

    public static void main(String[] args) {
        ProductDAOSQL productDAO = new ProductDAOSQLImpl();
        Product product = new Product();
        product.setName("电脑");
        product.setPrice(99);
        productDAO.add(product);

        System.out.println(productDAO.queryById(2));

        List<Product> products = productDAO.queryAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
