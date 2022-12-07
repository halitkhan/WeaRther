package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WeatherInformation {

    @SerializedName("id")
    @Expose
    private int weatherId; //Weather condition id

    @SerializedName("main")
    @Expose
    private String mainWeather; //Group of weather parameters (Rain, Snow, Extreme etc.)

    @SerializedName("description")
    @Expose
    private String description;  //Weather condition within the group. You can get the output in your language.

    /*
    @SerializedName("icon")
    @Expose
    private int iconId // Weather icon id
     */
}
