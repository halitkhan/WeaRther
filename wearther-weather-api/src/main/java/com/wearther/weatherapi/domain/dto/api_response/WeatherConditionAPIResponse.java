package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class WeatherConditionAPIResponse {

    @SerializedName("list")
    @Expose
    private List<Weathers> weathersList;

    @SerializedName("city")
    @Expose
    private CityInformation cityInformation;
}
