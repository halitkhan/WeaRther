package com.wearther.weatherapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeekDay {

    private String datetime;
    private float temp;
    private float tempMax;
    private float tempMin;
    private float feelsLike;
    private  String icon;
    private List<DayHour> hours;
}
