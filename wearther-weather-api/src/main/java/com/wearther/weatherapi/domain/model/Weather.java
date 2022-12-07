package com.wearther.weatherapi.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    int id;
    String main;
    String description;
    //int icon;
}
