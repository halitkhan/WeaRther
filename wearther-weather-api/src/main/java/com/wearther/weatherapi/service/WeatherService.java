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
                SimpleDateFormat sfHour = new SimpleDateFormat("hh:mm:ss");
                DayHour dayHour = new DayHour(
                        sfHour.parse(hour.getDatetime()),
                        hour.getTemp(),
                        hour.getIcon()
                );
                dayHourList.add(dayHour);
            }
            SimpleDateFormat sfDay = new SimpleDateFormat("yyyy-mm-dd");
            WeekDay weekDay = new WeekDay(
                    sfDay.parse(day.getDatetime()),
                    day.getTemp(),
                    day.getIcon(),
                    dayHourList
            );
            dayList.add(weekDay);
        }

        WeatherCondition weatherCondition = new WeatherCondition(
                weatherConditionAPIResponse.getResolvedAddress(),
                weatherConditionAPIResponse.getCurrentConditions().getTemp(),
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
