package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

@Service
public class WeatherAPIService {
    private WeatherConditionAPIResponse weatherConditionAPIResponse;

    public WeatherConditionAPIResponse getWeatherInformation(String city, String unitGroup) throws IOException {
        Call<WeatherConditionAPIResponse> weatherConditionAPIResponseCall = APIRepository.getWeather(city, unitGroup);
        weatherConditionAPIResponse = weatherConditionAPIResponseCall.execute().body();

        return weatherConditionAPIResponse;
    }


}
