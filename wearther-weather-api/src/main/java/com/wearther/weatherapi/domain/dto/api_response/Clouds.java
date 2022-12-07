package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Clouds {

    @SerializedName("all")
    @Expose
    private int cloudsAll; //Cloudiness, %
}
