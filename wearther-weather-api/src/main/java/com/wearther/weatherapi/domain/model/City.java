package com.wearther.weatherapi.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private int id;
    private String name;
    private String country;
    private String population;
    private String timezone;
    private String sunrise;
    private String sunset;
}
