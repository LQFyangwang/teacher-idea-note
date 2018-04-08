package com.gs.aop;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeSave implements MethodBeforeAdvice {

    /**
     * 此方法用于aop某个方法执行前所要做的事情
     * @param method
     * @param objects
     * @param o
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("保存前...");
    }
}
