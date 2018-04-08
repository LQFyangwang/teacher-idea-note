package com.gs.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Master on 2017/6/28.
 */
public class I18NAction extends ActionSupport {

    public String page() {
        ActionContext actionContext = ActionContext.getContext();
        System.out.println(getText("name"));
        System.out.println(getText("test"));
        return "page";
    }
}
