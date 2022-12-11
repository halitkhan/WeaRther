package com.wearther.weartherapi.controller;

import com.wearther.weartherapi.dto.model.WeatherCondition;
import com.wearther.weartherapi.service.WeartherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/weather-condition")
public class WeartherController {

    @Autowired
    WeartherService service;

    @GetMapping(value = "/{city}/{unitGroup}")
    public WeatherCondition getWeather(@PathVariable(value = "city") String city,
                                       @PathVariable(value = "unitGroup") String unitGroup) throws IOException {
        WeatherCondition weatherCondition = service.getWeatherCondition(city, unitGroup);
        return weatherCondition;
    }

}
