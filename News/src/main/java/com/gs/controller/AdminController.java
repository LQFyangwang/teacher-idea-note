package com.gs.controller;

import com.gs.bean.Admin;
import com.gs.common.bean.ControllerResult;
import com.gs.service.AdminService;
import com.gs.service.impl.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Master on 2017/8/3.
 */
public class AdminController extends ActionSupport implements ServletRequestAware {
    private AdminService adminService;
    private HttpServletRequest request;

    private Admin admin;

    private ControllerResult result;

    public AdminController() {
        this.adminService = new AdminServiceImpl();
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ControllerResult getResult() {
        return result;
    }

    public String page() {
        return "page";
    }

    public String login() {
        admin = adminService.queryByPhonePwd(admin.getPhone(), admin.getPwd());
        if (admin == null) {
            result = ControllerResult.getFailResult("登录名或密码错误");
        } else {
            // 由于查找admin的时候，把admin作为一个成员变量以json数据格式的形式返回到前端页面，此时
            // admin内部的属性会被使用，导致需要从数据库中加载admin关联的其他对象，发送n条sql语句
            // 如何解决这个问题？
            // 在Admin对象中，考虑哪些关联对象不需要直接查询出来，如果不需要查询，则在此关联对象上告诉他不需要json序列化
            // 在不需要序列化的对象上或此对象的getter方法上加上如下注解：
            // @JSON(serialize = false)
            HttpSession session = request.getSession();
            session.setAttribute("login_admin", admin);
            result = ControllerResult.getSuccessResult("登录成功");
        }
        return "login";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
