package com.gs.test;

import com.gs.bean.Product;
import com.gs.dao.ProductDAO;
import com.gs.dao.impl.ProductDAOHQLImpl;

import java.util.List;

/**
 * Created by Master on 2017/7/19.
 */
public class ProductDAOTest {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAOHQLImpl();
        Product product = new Product();
        product.setName("hello");
        product.setPrice(99);
        productDAO.add(product);

        System.out.println(productDAO.queryById(1));

        List<Product> products = productDAO.queryAll();
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("*************************************");
        List<Object[]> productObjArray = productDAO.queryAll1();
        for (Object[] array : productObjArray) {
            System.out.println(array[0] + ", " + array[1]);
        }

        Product p = new Product();
        p.setId(1);
        p.setName("r条幅");
        p.setPrice(100);
        productDAO.update(p);

        productDAO.remove(p);
    }
}
