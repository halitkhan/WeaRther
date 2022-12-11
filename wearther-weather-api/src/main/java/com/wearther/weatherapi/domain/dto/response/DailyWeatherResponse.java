package com.wearther.weatherapi.domain.dto.response;

import com.wearther.weatherapi.domain.model.WeekDay;

import java.util.List;

public class DailyWeatherResponse {
    private String resolvedAddress;
    private float temp;
    private String conditions;
    private float rain;
    private float uvindex;
    private float windSpeed;
    private float humidity;
    private float visibilty;
    private float winddir;
    private String sunrise;
    private String sunset;
    private String icon;
    private List<DailyWeekDayResponse> days;
}
