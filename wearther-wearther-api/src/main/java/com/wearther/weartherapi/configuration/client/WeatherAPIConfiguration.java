package com.wearther.weartherapi.configuration.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WeatherAPIConfiguration {

    @Bean
    public WebClient localApiClient(){
        return WebClient.create("http://localhost:8081/weather-condition");
    }
}
