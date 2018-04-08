package com.gs.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundSave implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before...");
        Object obj = methodInvocation.proceed(); // 执行目标方法 ==> UserTest.save
        System.out.println("after...");
        return obj;
    }
}
