package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.CityAPIResponse;
import retrofit2.Call;
import retrofit2.http.Query;

//Engin hocanın eklediği kodlar şu anda ana koda bağlı değiller
import java.util.List;

public class APIrepository {

    public Call<List<CityAPIResponse>> getCityList(String city,String APIKey){

        return RetrofitInstance.createAPI().getCityList(city, APIKey);
    }
}
