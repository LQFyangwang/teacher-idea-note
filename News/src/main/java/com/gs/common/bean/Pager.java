package com.gs.common.bean;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class Pager<T> {

    private int pageNo;
    private int pageSize;
    private long total;
    private List<T> rows;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getBeginIndex() {
        return (pageNo - 1) * pageSize;
    }

}
