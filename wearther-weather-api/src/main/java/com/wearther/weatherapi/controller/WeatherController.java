package com.wearther.weatherapi.controller;

import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import com.wearther.weatherapi.domain.dto.response.DailyWeatherResponse;
import com.wearther.weatherapi.domain.dto.response.HourlyWeatherResponse;
import com.wearther.weatherapi.domain.model.WeatherCondition;
import com.wearther.weatherapi.service.WeatherAPIService;
import com.wearther.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/weather-condition")
public class WeatherController {

    @Autowired()
    private WeatherService service;

    @GetMapping(value = "/{city}/{unitGroup}")
    public WeatherCondition getWeatherInformation(@PathVariable(value = "city") String city,
                                                  @PathVariable(value = "unitGroup") String unitGroup) throws IOException, ParseException {
        WeatherCondition weatherCondition = service.getWeatherCondition(city, unitGroup);
        return weatherCondition;
    }
}
