package com.wearther.weatherapi.domain.dto.response;

import com.wearther.weatherapi.domain.model.DayHour;

import java.util.Date;
import java.util.List;

public class HourlyWeekDayResponse {
    private Date datetime;
    private float temp;
    private  String icon;
    private List<HourlyDayHourResponse> hours;
}
