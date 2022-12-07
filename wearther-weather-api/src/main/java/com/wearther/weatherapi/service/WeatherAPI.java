package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.CityAPIResponse;
import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface WeatherAPI {

    @GET("direct?")
    Call<List<CityAPIResponse>> getCityList(@Query("q") String city, @Query("appid") String APIKey);
    @GET("forecast?")
    Call<WeatherConditionAPIResponse> getWeather(@Query("lat") String lat,
                                                       @Query("lon") String lon,
                                                       @Query("units") String units,
                                                       @Query("appid") String APIKey);
}
