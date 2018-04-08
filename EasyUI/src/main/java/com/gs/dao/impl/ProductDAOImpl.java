package com.gs.dao.impl;

import com.gs.bean.Product;
import com.gs.common.Pager;
import com.gs.dao.AbstractBaseDAO;
import com.gs.dao.ProductDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class ProductDAOImpl extends AbstractBaseDAO implements ProductDAO {
    public void add(Product product) {
        getConn();
        String sql = "insert into t_product(name, price, quantity) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public void update(Product product) {
        getConn();
        String sql = "update t_product set name = ?, price = ?, quantity = ? where id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setInt(4, product.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public List<Product> queryAll() {
        return null;
    }

    public Pager<Product> queryByPager(Pager<Product> pager) {
        getConn();
        String sql = "select * from t_product order by id desc limit ?,?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, pager.getBeginIndex());
            preparedStatement.setInt(2, pager.getPageSize());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> products = new ArrayList<Product>();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setStatus(resultSet.getString("status"));
                products.add(product);
            }
            pager.setResults(products);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return pager;
    }

    public Product queryById(Integer s) {
        return null;
    }

    public void valid(Integer s, String status) {
        getConn();
        String sql = "update t_product set status = ? where id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setInt(2, s);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public int count() {
        getConn();
        String sql = "select count(id) from t_product";
        int count = 0;
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return count;
    }
}
