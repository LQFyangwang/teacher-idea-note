package com.gs.service;

import com.gs.common.Pager;

import java.util.List;

/**
 * Created by Master on 2017/6/30.
 */
public interface BaseService<PK, T> {
    public void add(T t);
    public void update(T t);
    public List<T> queryAll();
    public Pager<T> queryByPager(Pager<T> pager);
    public T queryById(PK pk);
    public void valid(PK pk, String status);
    public int count();
}
