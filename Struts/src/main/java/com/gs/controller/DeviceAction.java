package com.gs.controller;

import com.gs.bean.Device;
import com.gs.common.ControllerResult;
import com.gs.common.Pager;
import com.gs.service.DeviceService;
import com.gs.service.impl.DeviceServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class DeviceAction extends ActionSupport {

    private DeviceService deviceService;

    public DeviceAction() {
        this.deviceService = new DeviceServiceImpl();
    }

    private Device device;

    private List<Device> devices;
    private int total;

    private int page = 1;
    private int pageSize = 10;

    private ControllerResult controllerResult;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public int getTotal() {
        return total;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public ControllerResult getControllerResult() {
        return controllerResult;
    }

    public String add() {
        deviceService.add(device);
        controllerResult = ControllerResult.getSuccessResult("添加成功！");
        return "add";
    }

    public String pager() {
        Pager<Device> pager = new Pager<Device>();
        pager.setPage(page);
        pager.setPageSize(pageSize);
        pager = deviceService.queryByPager(pager);
        pager.setTotal(deviceService.count());
        devices = pager.getResults();
        total = pager.getTotal();
        return "pager";
    }
}
