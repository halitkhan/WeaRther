package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Day {

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("temp")
    @Expose
    private float temp;
    @SerializedName("tempmax")
    @Expose
    private float tempMax;
    @SerializedName("tempmin")
    @Expose
    private float tempMin;
    @SerializedName("feelslike")
    @Expose
    private float feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("hours")
    @Expose
    private List<Hour> hours;
}
