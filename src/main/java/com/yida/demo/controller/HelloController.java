package com.yida.demo.controller;

import com.github.pagehelper.PageHelper;
import com.yida.demo.entity.City;
import com.yida.demo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloService helloService;


    @RequestMapping("/hello")
    public String hello(ModelMap modelMap) {
        modelMap.put("now", new Date());
        helloService.sayHello();
        City city = helloService.getCity(1);
        modelMap.put("city", city);

        List<City> cities = helloService.findByPage(2, 20);
        modelMap.put("cities", cities);

        LOGGER.debug("hhhhhhh");
        return "hello";
    }


    @ResponseBody
    @RequestMapping("/respJson")
    public String respJson() {
        return "{id:1}";
    }




}
