package com.gs.service;

import com.gs.dao.BaseDAO;

/**
 * Created by Master on 2017/8/4.
 */
public class TestService {

    private BaseDAO testDAO;

    public void setTestDAO(BaseDAO baseDAO) {
        this.testDAO = testDAO;
    }

    public void test() {
        testDAO.test();
    }
}
