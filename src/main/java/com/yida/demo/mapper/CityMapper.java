package com.yida.demo.mapper;

import com.yida.demo.entity.City;

import java.util.List;

public interface CityMapper {

    City get(Long id);

    List<City> findByPage();
}
