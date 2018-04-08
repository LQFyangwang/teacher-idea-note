package com.gs.servicetest;

import com.gs.daotest.BaseDAO;

/**
 * Created by Master on 2017/8/4.
 */
public class TestService {

    private BaseDAO testDAO;

    public void setTestDAO(BaseDAO testDAO) {
        this.testDAO = testDAO;
    }

    public void test() {
        testDAO.test();
    }

}
