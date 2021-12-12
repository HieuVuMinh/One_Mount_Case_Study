package com.onemount.service.infrastructure.datasources.sql;

import java.util.Optional;

public interface GeneralUseCase<T> {

    Iterable<T> findAll();
    Optional<T> findById(String id);
    T save(T t);
    void deleteById(String id);
}
