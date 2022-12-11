package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import retrofit2.Call;

//Engin hocanın eklediği kodlar şu anda ana koda bağlı değiller
import java.util.List;


public class APIRepository {
    private static final String APIKey="63CCRHWSR6RHVFMRP2U67HKCR";
    public static Call<WeatherConditionAPIResponse> getWeather(String city, String unitGroup){

        return RetrofitInstance.createAPI().getWeather(city, unitGroup , APIKey, "json");
        }
}

