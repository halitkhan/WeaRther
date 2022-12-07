package com.wearther.weatherapi.controller;

import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import com.wearther.weatherapi.service.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/weather-condition")
public class WeatherController {

    @Autowired()
    private WeatherAPIService service;

    @GetMapping
    public WeatherConditionAPIResponse getDefaultWeatherInformation(){
        WeatherConditionAPIResponse weatherConditionAPIResponseList = service.getCityInformation("istanbul", "metric");
        return weatherConditionAPIResponseList;
    }

    @GetMapping(value = "/{city}")
    public WeatherConditionAPIResponse getStandardWeatherInformation(@PathVariable(value = "city") String city){
        WeatherConditionAPIResponse weatherConditionAPIResponseList = service.getCityInformation(city, "metric");
        return weatherConditionAPIResponseList;
    }

    @GetMapping(value = "/{city}/{units}")
    public WeatherConditionAPIResponse getWeatherInformation(@PathVariable(value = "city") String city, @PathVariable(value = "units") String units){
        WeatherConditionAPIResponse weatherConditionAPIResponseList = service.getCityInformation(city, units);
        return weatherConditionAPIResponseList;
    }
}
