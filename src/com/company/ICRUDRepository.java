package com.company;

import java.util.Collection;

public interface ICRUDRepository<Tid,T> {

    T add(T elem) throws Exception;

    void delete(T elem) throws Exception;

    void update(T elem, Tid id);

    T findById(Tid id);

    Iterable<T> findAll();

    Collection<T> getAll();
}