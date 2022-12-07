package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.CityInformation;
import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import com.wearther.weatherapi.domain.dto.api_response.WeatherInformation;
import com.wearther.weatherapi.domain.dto.api_response.Weathers;
import com.wearther.weatherapi.domain.dto.response.WeatherResponse;
import com.wearther.weatherapi.domain.model.City;
import com.wearther.weatherapi.domain.model.Weather;
import com.wearther.weatherapi.domain.model.WeatherCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


//API'den gelen dataları
@Service
public class WeatherService {

    @Autowired
    WeatherAPIService apiService;

    public WeatherResponse getWeather(String city, String units) throws ParseException {
        WeatherConditionAPIResponse weatherConditionAPIResponse = apiService.getCityInformation(city, units);
        List<WeatherCondition> weatherConditionList = new ArrayList<>();

        for (Weathers weather : weatherConditionAPIResponse.getWeathersList()){
            WeatherCondition weatherCondition = new WeatherCondition();
            Random rnd = new Random();
            weatherCondition.setId(rnd.nextInt(1000));
            weatherCondition.setTemperature(weather.getMain().getTemperature());
            weatherCondition.setFeltTemperature(weather.getMain().getFeltTemperature());
            weatherCondition.setTempMax(weather.getMain().getTempMax());
            weatherCondition.setTempMin(weather.getMain().getTempMin());
            weatherCondition.setPressure(weather.getMain().getPressure());
            weatherCondition.setSeaLevel(weather.getMain().getSeaLevel());
            weatherCondition.setGroundLevel(weather.getMain().getGroundLevel());
            weatherCondition.setHumidity(weather.getMain().getHumidity());
            weatherCondition.setTemp_kf(weather.getMain().getTemp_kf());
            List<Weather> weatherList = new ArrayList<>();
            for(WeatherInformation weatherInformation : weather.getWeatherInformations()){
                Weather weatherInf = new Weather();
                weatherInf.setId(weatherInformation.getWeatherId());
                weatherInf.setMain(weatherInformation.getMainWeather());
                weatherInf.setDescription(weatherInformation.getDescription());
                weatherList.add(weatherInf);
            }
            weatherCondition.setWeatherList(weatherList);
            weatherCondition.setCloudsAll(weather.getClouds().getCloudsAll());
            weatherCondition.setWindSpeed(weather.getWind().getWindSpeed());
            weatherCondition.setWindDegree(weather.getWind().getWindDegree());
            weatherCondition.setWindGust(weather.getWind().getWindGust());
            weatherCondition.setVisibility(weather.getVisibility());
            weatherCondition.setPop(weather.getPop());
            weatherCondition.setRain3h(weather.getRain().getRain());
            weatherCondition.setSnow3h(weather.getSnow().getSnow());
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
            SimpleDateFormat sfWithHour = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
            weatherCondition.setDate(sf.parse(weather.getDatetime()));
            weatherCondition.setDateTime(sfWithHour.parse(weather.getDatetime()));
            weatherConditionList.add(weatherCondition);
        }

        City cityInfo = new City();
        CityInformation cityInformation = weatherConditionAPIResponse.getCityInformation();
        cityInfo.setId(cityInformation.getId());
        cityInfo.setName(cityInformation.getName());
        cityInfo.setCountry(cityInformation.getCountry());
        cityInfo.setPopulation(cityInformation.getPopulation());
        cityInfo.setSunrise(cityInformation.getSunrise());
        cityInfo.setSunset(cityInformation.getSunset());

        WeatherResponse weatherResponse = null;

        setWeather(weatherConditionList, cityInfo);

        return weatherResponse;
    }

    private void setWeather(List<WeatherCondition> weatherConditionList, City cityInfo) throws ParseException {
    }
}
