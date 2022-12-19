package com.wearther.weartherapi.dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DayHour {
    private String datetime;
    private float temp;
    private float feelsLike;
    private String icon;
}
