package com.wearther.weartherapi.controller;

import com.wearther.weartherapi.dto.model.WeatherCondition;
import com.wearther.weartherapi.service.WeartherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping(value = "/weather-condition")
public class WeartherController {

    @Autowired
    WeartherService service;

    @GetMapping(value = "/{city}/{unitGroup}")
    public ResponseEntity<WeatherCondition> getWeather(@PathVariable(value = "city") String city,
                                       @PathVariable(value = "unitGroup") String unitGroup) throws IOException {
        WeatherCondition weatherCondition = service.getWeatherCondition(city, unitGroup);
        return ResponseEntity.ok(weatherCondition);
    }

}
