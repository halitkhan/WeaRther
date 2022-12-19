package com.wearther.weatherapi.service;

import com.wearther.weatherapi.domain.dto.api_response.Day;
import com.wearther.weatherapi.domain.dto.api_response.Hour;
import com.wearther.weatherapi.domain.dto.api_response.WeatherConditionAPIResponse;
import com.wearther.weatherapi.domain.model.DayHour;
import com.wearther.weatherapi.domain.model.WeatherCondition;
import com.wearther.weatherapi.domain.model.WeekDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherAPIService apiService;

    public WeatherCondition getWeatherCondition(String city, String unitGroup) throws IOException, ParseException {
        WeatherConditionAPIResponse weatherConditionAPIResponse = apiService.getWeatherInformation(city, unitGroup);
        List<WeekDay> dayList = new ArrayList<>();
        for(Day day : weatherConditionAPIResponse.getDays()){
            List<DayHour> dayHourList = new ArrayList<>();
            for (Hour hour : day.getHours()){
                DayHour dayHour = new DayHour(
                        hour.getDatetime(),
                        hour.getTemp(),
                        hour.getFeelsLike(),
                        hour.getIcon()
                );
                dayHourList.add(dayHour);
            }
            WeekDay weekDay = new WeekDay(
                    day.getDatetime(),
                    day.getTemp(),
                    day.getTempMax(),
                    day.getTempMin(),
                    day.getFeelsLike(),
                    day.getIcon(),
                    dayHourList
            );
            dayList.add(weekDay);
        }

        WeatherCondition weatherCondition = new WeatherCondition(
                weatherConditionAPIResponse.getResolvedAddress(),
                weatherConditionAPIResponse.getCurrentConditions().getTemp(),
                weatherConditionAPIResponse.getCurrentConditions().getFeelsLike(),
                weatherConditionAPIResponse.getCurrentConditions().getConditions(),
                weatherConditionAPIResponse.getCurrentConditions().getRain(),
                weatherConditionAPIResponse.getCurrentConditions().getUvindex(),
                weatherConditionAPIResponse.getCurrentConditions().getWindSpeed(),
                weatherConditionAPIResponse.getCurrentConditions().getHumidity(),
                weatherConditionAPIResponse.getCurrentConditions().getVisibility(),
                weatherConditionAPIResponse.getCurrentConditions().getWinddir(),
                weatherConditionAPIResponse.getCurrentConditions().getSunrise(),
                weatherConditionAPIResponse.getCurrentConditions().getSunset(),
                weatherConditionAPIResponse.getCurrentConditions().getIcon(),
                dayList
        );

        return weatherCondition;
    }
}
