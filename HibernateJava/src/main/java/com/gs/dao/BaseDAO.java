package com.gs.dao;

import java.util.List;

/**
 * Created by Master on 2017/7/19.
 */
public interface BaseDAO<PK, T> {
    public T queryById(PK pk);
    public void add(T t);
    public void remove(T t);
    public void update(T t);
    public List<T> queryAll();
}
