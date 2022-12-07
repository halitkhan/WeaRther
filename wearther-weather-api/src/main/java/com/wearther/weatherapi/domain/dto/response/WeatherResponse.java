package com.wearther.weatherapi.domain.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {

    private int id;
    private float temperature;
    private float feltTemperature;
    private float tempMin;
    private float tempMax;
    private float humidity;
    private float visibility;
    private String name;
    private String country;
    private String sunrise;
    private String sunset;
    private Enum Day;
}
