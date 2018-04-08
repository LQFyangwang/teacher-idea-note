package com.gs.dao;

public interface BaseDAO<PK, T> {

     void save(T t);

     void remove(PK pk);

}
