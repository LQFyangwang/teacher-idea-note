package com.gs.common;

import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public class Pager<T> {

    private int page;
    private int pageSize;

    private List<T> results; // 用于存储分页的结果
    private int total;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBeginIndex() {
        return (page - 1) * pageSize;
    }

}
