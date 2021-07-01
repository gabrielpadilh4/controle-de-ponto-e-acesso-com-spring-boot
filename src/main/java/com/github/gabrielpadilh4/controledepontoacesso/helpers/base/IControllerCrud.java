package com.github.gabrielpadilh4.controledepontoacesso.helpers.base;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IControllerCrud<T> {
    T create(T entity);

    List<T> getList();

    ResponseEntity<T> getById(long id) throws Exception;

    T update(T entity);

    ResponseEntity delete(long id);
}
