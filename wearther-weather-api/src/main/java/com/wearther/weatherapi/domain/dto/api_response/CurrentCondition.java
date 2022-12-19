package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CurrentCondition {

    @SerializedName("temp")
    @Expose
    private float temp;
    @SerializedName("feelslike")
    @Expose
    private float feelsLike;

    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("precip")
    @Expose
    private float rain;
    @SerializedName("uvindex")
    @Expose
    private float uvindex;
    @SerializedName("windspeed")
    @Expose
    private float windSpeed;
    @SerializedName("humidity")
    @Expose
    private float humidity;
    @SerializedName("visibility")
    @Expose
    private float visibility;
    @SerializedName("winddir")
    @Expose
    private float winddir;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("icon")
    @Expose
    private String icon;

}
