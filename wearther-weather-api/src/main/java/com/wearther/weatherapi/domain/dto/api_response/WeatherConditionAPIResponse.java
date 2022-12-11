package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class WeatherConditionAPIResponse {

    @SerializedName("resolvedAddress")
    @Expose
    private String resolvedAddress;

    @SerializedName("days")
    @Expose
    private List<Day> days;

    @SerializedName("currentConditions")
    @Expose
    private CurrentCondition currentConditions;
}
