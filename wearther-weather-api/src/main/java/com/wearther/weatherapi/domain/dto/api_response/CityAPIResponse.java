package com.wearther.weatherapi.domain.dto.api_response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CityAPIResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("country")
    @Expose
    private String country;
}
