package com.wearther.weatherapi.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Engin hocanın eklediği kodlar ana koda bağlı değiller
public  final class RetrofitInstance {

    private static Retrofit retrofit_instance;
    private static WeatherAPI api;    private static final  String BASE_URL="https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/";

    static{
        if(retrofit_instance==null)
        retrofit_instance=new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static WeatherAPI createAPI(){

        api=retrofit_instance.create(WeatherAPI.class);
        return api;
    }
}
