package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Rain {

    @SerializedName("3h")
    @Expose
    private float rain; //Rain volume for last 3 hours, mm
}
