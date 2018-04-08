package com.gs.intercepter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by Master on 2017/6/26.
 */
public class MyMethodInterceptor extends MethodFilterInterceptor {
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        System.out.println("进入拦截器");
        return invocation.invoke();
    }
}
