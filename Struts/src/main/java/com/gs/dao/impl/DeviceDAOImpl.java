package com.gs.dao.impl;

import com.gs.bean.Device;
import com.gs.common.DateUtil;
import com.gs.common.Pager;
import com.gs.dao.AbstractBaseDAO;
import com.gs.dao.DeviceDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class DeviceDAOImpl extends AbstractBaseDAO implements DeviceDAO {
    public void add(Device device) {
        getConn();
        String sql = "insert into t_device(id, name, price, buy_date) values(uuid(),?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, device.getName());
            preparedStatement.setDouble(2, device.getPrice());
            preparedStatement.setDate(3, DateUtil.convertor(device.getBuyDate()));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        close();
    }

    public void update(Device device) {

    }

    public List<Device> queryAll() {
        return null;
    }

    public Pager<Device> queryByPager(Pager<Device> pager) {
        getConn();
        String sql = "select * from t_device limit ?,?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, pager.getBeginIndex());
            preparedStatement.setInt(2, pager.getPageSize());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Device> devices = new ArrayList<Device>();
            while (resultSet.next()) {
                Device device = new Device();
                device.setId(resultSet.getString("id"));
                device.setName(resultSet.getString("name"));
                device.setPrice(resultSet.getDouble("price"));
                device.setBuyDate(resultSet.getDate("buy_date"));
                device.setUseful(resultSet.getString("useful"));
                device.setStatus(resultSet.getString("status"));
                devices.add(device);
            }
            pager.setResults(devices);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return pager;
    }

    public Device queryById(String s) {
        return null;
    }

    public void valid(String s, String status) {

    }

    public int count() {
        getConn();
        String sql = "select count(id) from t_device";
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
