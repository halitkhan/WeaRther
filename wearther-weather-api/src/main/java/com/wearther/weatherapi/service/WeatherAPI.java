package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
public interface WeatherAPI {
    @GET("timeline/{city}?")
    Call<WeatherConditionAPIResponse> getWeather(@Path(value = "city") String city,
                                                 @Query(value = "unitGroup") String unitGroup,
                                                 @Query(value = "key") String APIKey,
                                                 @Query(value = "contentType") String contentType);
}
