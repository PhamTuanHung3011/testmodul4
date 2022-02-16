package com.example.minitest.controller;

import com.example.minitest.model.City;
import com.example.minitest.model.Country;
import com.example.minitest.service.city.ICityService;
import com.example.minitest.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/home/city")
public class CityController {
    @Autowired
    ICityService iCityService;

    @Autowired
    ICountryService iCountryService;


    @GetMapping
    public List<City> showCity() {
       return iCityService.findAll();
    }

    @GetMapping("/country")
    public List<Country> showCountry() {
        return iCountryService.findAll();
    }

    @PostMapping("/create")
    public City createCity(@RequestBody City city) {
        iCityService.save(city);
        return city;
    }

    @GetMapping("/{id}")
    public Optional searchEdit(@PathVariable Long id) {
        Optional city = iCityService.findById(id);
        return city;
    }

    @PutMapping("/edit")
    public City editCity(@RequestBody City city) {
        iCityService.save(city);
        return city;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCity(@PathVariable Long id) {
        iCityService.remove(id);
    }
}
