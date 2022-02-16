package com.example.minitest.service.country;

import java.util.List;
import java.util.Optional;

public interface ICountryService<Country> {

    List<Country> findAll();

    Country findById(Long id);

    Country save(Country city);

    void remove(Long id);
}
