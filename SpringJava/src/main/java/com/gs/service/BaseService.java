package com.gs.service;

public interface BaseService<PK, T> {

    void save(T t);

    void remove(PK pk);

}
