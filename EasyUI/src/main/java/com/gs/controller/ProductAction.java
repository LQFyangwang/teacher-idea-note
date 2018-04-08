package com.gs.controller;

import com.gs.bean.Product;
import com.gs.common.ControllerResult;
import com.gs.common.Pager;
import com.gs.service.ProductService;
import com.gs.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Master on 2017/7/6.
 */
public class ProductAction extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;
    private ProductService productService;
    private Product product;
    private int page;

    private int total;
    private List<Product> rows;

    private ControllerResult controllerResult;

    private int id;
    private String status;

    public ProductAction() {
        this.productService = new ProductServiceImpl();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public List<Product> getRows() {
        return rows;
    }

    public ControllerResult getControllerResult() {
        return controllerResult;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String add() {
        productService.add(product);
        controllerResult = ControllerResult.getSuccessResult("添加成功！");
        return "add";
    }

    public String pager() {
        // 调用service
        int pageSize = Integer.valueOf(request.getParameter("rows")); // 每一页显示多少个数据
        Pager<Product> pager = new Pager<Product>();
        pager.setPage(page);
        pager.setPageSize(pageSize);
        pager = productService.queryByPager(pager);
        rows = pager.getResults();
        total = productService.count();
        return "pager";
    }

    public String update() {
        productService.update(product);
        controllerResult = ControllerResult.getSuccessResult("修改商品成功！");
        return "update";
    }

    public String valid() {
        productService.valid(id, status);
        if (status.equals("y")) {
            controllerResult = ControllerResult.getSuccessResult("激活商品成功！");
        } else if (status.equals("n")) {
            controllerResult = ControllerResult.getSuccessResult("冻结商品成功！");
        }
        return "valid";
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
