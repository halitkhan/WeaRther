package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.CityAPIResponse;
import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

@Service
public class WeatherAPIService {
    private Retrofit retrofit;
    private WeatherAPI weatherAPI;
    private final String cityUrl = "http://api.openweathermap.org/geo/1.0/";
    private final String weatherUrl = "http://api.openweathermap.org/data/2.5/";
    private final String APIKey = "0c7a834f071d3066a596578d58fda5a3";

    private WeatherConditionAPIResponse weatherConditionAPIResponse;
    private CityAPIResponse cityAPIResponse;


    public WeatherConditionAPIResponse getCityInformation(String city, String units) {
        retrofit = new Retrofit.Builder()
                .baseUrl(cityUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherAPI = retrofit.create(WeatherAPI.class);
        Call<List<CityAPIResponse>> cityAPIResponseCall = weatherAPI.getCityList(city, APIKey);
        cityAPIResponseCall.enqueue(new Callback<List<CityAPIResponse>>() {
            @Override
            public void onResponse(Call<List<CityAPIResponse>> call, Response<List<CityAPIResponse>> response) {
                if(response.isSuccessful()){
                    cityAPIResponse = response.body().get(0);
                    weatherConditionAPIResponse = getWeatherInformation(cityAPIResponse.getLat(),
                            cityAPIResponse.getLon(), units);
                }
            }

            @Override
            public void onFailure(Call<List<CityAPIResponse>> call, Throwable throwable) {
                System.out.println(throwable.toString());
            }
        });
        return weatherConditionAPIResponse;
    }

    public WeatherConditionAPIResponse getWeatherInformation(String lat, String lon, String units){
        retrofit = new Retrofit.Builder()
                .baseUrl(weatherUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherAPI = retrofit.create(WeatherAPI.class);
        Call<WeatherConditionAPIResponse> weatherConditionAPIResponseCall = weatherAPI.getWeather(lat, lon, units, APIKey);
        weatherConditionAPIResponseCall.enqueue(new Callback<WeatherConditionAPIResponse>() {
            @Override
            public void onResponse(Call<WeatherConditionAPIResponse> call, Response<WeatherConditionAPIResponse> response) {
                if(response.isSuccessful()){
                    weatherConditionAPIResponse = response.body();
                }
            }

            @Override
            public void onFailure(Call<WeatherConditionAPIResponse> call, Throwable throwable) {
                System.out.println(throwable.toString());
            }
        });

        return weatherConditionAPIResponse;
    }


}
