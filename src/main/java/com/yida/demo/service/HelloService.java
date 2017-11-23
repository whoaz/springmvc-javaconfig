package com.yida.demo.service;

import com.github.pagehelper.PageHelper;
import com.yida.demo.entity.City;
import com.yida.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    private CityMapper cityMapper;

    public void sayHello() {
        System.out.println("I am Jack");
    }

    public City getCity(long id) {
        return cityMapper.get(id);
    }
    public List<City> findByPage(int pageNo,int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return cityMapper.findByPage();
    }

}
