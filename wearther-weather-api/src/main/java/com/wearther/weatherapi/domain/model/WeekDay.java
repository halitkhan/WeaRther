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

    private Date datetime;
    private float temp;
    private  String icon;
    private List<DayHour> hours;
}
