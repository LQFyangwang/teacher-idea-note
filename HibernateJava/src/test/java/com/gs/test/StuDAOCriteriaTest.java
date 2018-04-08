package com.gs.test;


import com.gs.dao.impl.StuDAOCriteriaImpl;

/**
 * Created by Master on 2017/7/31.
 */
public class StuDAOCriteriaTest {

    public static void testQuery() {
        StuDAOCriteriaImpl stuDAOCriteria = new StuDAOCriteriaImpl();
        stuDAOCriteria.queryById(0);
        stuDAOCriteria.queryById();
    }

    public static void main(String[] args) {
        testQuery();
    }
}
