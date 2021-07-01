package com.github.gabrielpadilh4.controledepontoacesso.helpers.base;

import java.util.List;
import java.util.Optional;

public interface IServiceCrud<T> {

    T save(T entity);
    T update(T entity);
    List<T> findAll();
    Optional<T> findById(long id);
    void delete(T entity);
    void deleteById(long id);
}
