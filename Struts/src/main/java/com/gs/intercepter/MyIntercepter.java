package com.gs.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by Master on 2017/6/26.
 */
public class MyIntercepter extends AbstractInterceptor {
    /**
     * ActionInvocation对象是Action的实例类
     * @param invocation
     * @return
     * @throws Exception
     */
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("进入自定义拦截器");
        // 前置方法
        ActionContext actionContext = invocation.getInvocationContext(); // 获取action上下文对象
        Map<String, Object> params = actionContext.getParameters();
        String[]  strArray = (String[]) params.get("test");
        String result;
        if (strArray != null && strArray.length > 0) {
            System.out.println("数据是" + strArray[0]);
            if (strArray[0] != null && strArray[0].equals("test")) {
                result = invocation.invoke(); // 调用action中指定的方法
            } else {
                result = "input";
            }
        } else {
            result = "input";
        }
        // 后置方法
        return result;
    }
}
