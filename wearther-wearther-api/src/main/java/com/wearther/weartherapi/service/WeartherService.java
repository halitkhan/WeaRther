package com.wearther.weartherapi.service;

import com.wearther.weartherapi.dto.model.WeatherCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class WeartherService {
    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);
    private final WebClient localApiClient;

    @Autowired
    public WeartherService(WebClient localApiClient) {
        this.localApiClient = localApiClient;
    }

    public WeatherCondition getWeatherCondition(String city, String unitGroup){
        Mono<WeatherCondition> weatherConditionMono =  localApiClient
                .get()
                .uri("/{city}/{unitGroup}", city, unitGroup)
                .retrieve()
                .bodyToMono(WeatherCondition.class);
        WeatherCondition weatherCondition = weatherConditionMono.share().block(REQUEST_TIMEOUT);
        return weatherCondition;
    }
}
