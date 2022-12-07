package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class Weathers {

    @SerializedName("main")
    @Expose
    private MainInformation main;

    @SerializedName("weather")
    @Expose
    private List<WeatherInformation> weatherInformations;

    @SerializedName("clouds")
    @Expose
    private Clouds clouds;

    @SerializedName("wind")
    @Expose
    private Wind wind;

    @SerializedName("visibility")
    @Expose
    private float visibility; //Average visibility, metres. The maximum value of the visibility is 10km

    @SerializedName("pop")
    @Expose
    private float pop; //Probability of precipitation. The values of the parameter vary between 0 and 1, where 0 is equal to 0%, 1 is equal to 100%

    @SerializedName("rain")
    @Expose
    private Rain rain;

    @SerializedName("snow")
    @Expose
    private Snow snow;

    @SerializedName("dt_txt")
    @Expose
    private String datetime;

}
