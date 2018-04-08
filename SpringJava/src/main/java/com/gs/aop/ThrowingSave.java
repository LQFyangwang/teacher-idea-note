package com.gs.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ThrowingSave implements ThrowsAdvice {

    /**
     *
     * @param m 哪个出现异常
     * @param arg1 方法有哪些参数
     * @param target 是哪个类的实例
     * @param e 出现了哪个异常
     */
    public void afterThrowing(Method m, Object[] arg1, Object target, Exception e) {
        System.out.println(m.getName() + ", " + e.getMessage() + "*******************");
        System.out.println(target);
        System.out.println("记录异常到数据库或文件");
    }
}
