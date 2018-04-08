package com.gs.controller;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Master on 2017/6/23.
 */
public class ServletAction implements ServletRequestAware, ServletResponseAware {

    private HttpServletRequest request;
    private HttpServletResponse response;

    public String execute() {
        // 获取ServletContext
        ServletContext applicaiton  = ServletActionContext.getServletContext();    // ServletAction上下文对象
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("sess", "sess_value");
        HttpServletResponse response = ServletActionContext.getResponse();

        ActionContext actionContext = ActionContext.getContext(); // 获取struts的action上下文对象
        Map<String, Object> params = actionContext.getParameters(); // 从页面传递过来的所有参数, Object为字符串数组
        Iterator<String> iterator = params.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + params.get(key));
        }
        System.out.println(actionContext.getName()); // 获取action的名称，struts配置文件中的名称
        actionContext.put("key", "value"); // 放入action上下文
        System.out.println(actionContext.get("name")); // 从上下文中获取数据，与parameter无关
        Map<String, Object> sess = actionContext.getSession(); // Struts封装的session对象，此session是一个Map结构，与原生session可共享数据
        System.out.println(sess.get("sess"));
        sess.put("sess_1", "sess_value1");
        System.out.println(session.getAttribute("sess_1"));
        return "success";
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }
}
