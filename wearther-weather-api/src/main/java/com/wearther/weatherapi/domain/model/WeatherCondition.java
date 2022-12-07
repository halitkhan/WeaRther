package com.wearther.weatherapi.domain.model;

import com.wearther.weatherapi.domain.dto.api_response.Weathers;
import com.wearther.weatherapi.domain.enums.Day;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class WeatherCondition {
    private int id;
    private float temperature;
    private float feltTemperature;
    private float tempMin;
    private float tempMax;
    private float pressure;
    private float seaLevel;
    private float groundLevel;
    private float humidity;
    private float temp_kf; //Internal Parameter
    private List<Weather> weatherList;
    private int cloudsAll;
    private float windSpeed;
    private int windDegree;
    private float windGust;
    private float visibility;
    private float pop; //Probability of precipitation
    private float rain3h; //Rain volume for last 3 hours, mm
    private float snow3h;
    private Date date;
    private Date dateTime;
}
