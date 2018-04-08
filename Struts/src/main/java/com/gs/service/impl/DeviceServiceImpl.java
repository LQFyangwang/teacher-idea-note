package com.gs.service.impl;

import com.gs.bean.Device;
import com.gs.common.Pager;
import com.gs.dao.DeviceDAO;
import com.gs.dao.impl.DeviceDAOImpl;
import com.gs.service.DeviceService;

import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class DeviceServiceImpl implements DeviceService {

    private DeviceDAO deviceDAO;

    public DeviceServiceImpl() {
        this.deviceDAO = new DeviceDAOImpl();
    }

    public void add(Device device) {
        deviceDAO.add(device);
    }

    public void update(Device device) {

    }

    public List<Device> queryAll() {
        return null;
    }

    public Pager<Device> queryByPager(Pager<Device> pager) {
        return deviceDAO.queryByPager(pager);
    }

    public Device queryById(String s) {
        return null;
    }

    public void valid(String s, String status) {

    }

    public int count() {
        return deviceDAO.count();
    }
}
