package com.wearther.weatherapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherCondition {

    private String resolvedAddress;
    private float temp;
    private float feelsLike;
    private String conditions;
    private float rain;
    private float uvindex;
    private float windSpeed;
    private float humidity;
    private float visibility;
    private float winddir;
    private String sunrise;
    private String sunset;
    private String icon;
    private List<WeekDay> days;

}
