package com.wearther.weatherapi.domain.dto.api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class MainInformation {

    @SerializedName("temp")
    @Expose
    private float temperature; //Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.

    @SerializedName("feels_like")
    @Expose
    private float feltTemperature; //This temperature parameter accounts for the human perception of weather. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.

    @SerializedName("temp_min")
    @Expose
    private float tempMin; //Minimum temperature at the moment of calculation. This is minimal forecasted temperature (within large megalopolises and urban areas), use this parameter optionally. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.

    @SerializedName("temp_max")
    @Expose
    private float tempMax; //Maximum temperature at the moment of calculation. This is maximal forecasted temperature (within large megalopolises and urban areas), use this parameter optionally. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.

    @SerializedName("pressure")
    @Expose
    private float pressure;  //Atmospheric pressure on the sea level by default, hPa

    @SerializedName("sea_level")
    @Expose
    private float seaLevel; //Atmospheric pressure on the sea level, hPa

    @SerializedName("grnd_level")
    @Expose
    private float groundLevel; //Atmospheric pressure on the ground level, hPa

    @SerializedName("humidity")
    @Expose
    private float humidity; //Humidity, %

    @SerializedName("temp_kf")
    @Expose
    private float temp_kf; //Internal parameter
}
