package com.example.minitest.service.city;

import java.util.List;
import java.util.Optional;

public interface ICityService<T> {

    List<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}