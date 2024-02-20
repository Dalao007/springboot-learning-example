package org.spring.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄森豪
 */
@RestController
@RequestMapping("/abc")
public class CityController {

    @Reference
    CityDubboService cityDubboService;

    @GetMapping
    public City getResult(){
        return cityDubboService.findCityByName("sads");
    }
}
