package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Snow {

    @SerializedName("3h")
    @Expose
    private float snow; //Snow volume for last 3 hours
}
