package com.gs.bean;

import java.util.Date;

/**
 * Created by Master on 2017/6/30.
 */
public class Device {

    private String id;
    private String name;
    private Date buyDate;
    private double price;
    private String useful;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUseful() {
        return useful;
    }

    public void setUseful(String useful) {
        this.useful = useful;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
