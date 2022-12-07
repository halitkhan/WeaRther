package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Wind {

    @SerializedName("speed")
    @Expose
    private float windSpeed; //Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.

    @SerializedName("deg")
    @Expose
    private int windDegree; //Wind direction, degrees (meteorological)

    @SerializedName("gust")
    @Expose
    private float windGust; //Wind gust. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour
}
