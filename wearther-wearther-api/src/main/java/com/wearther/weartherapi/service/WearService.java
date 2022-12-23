package com.wearther.weartherapi.service;

import com.wearther.weartherapi.dto.model.Clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WearService {

    private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);
    private final WebClient wearApiClient;

    @Autowired
    public WearService(@Qualifier("wearApiClient") WebClient localApiClient) {
        this.wearApiClient = localApiClient;
    }

    public List<Clothes> getClothes(String feelsLikeStatus, String gender){
        Mono<List<Clothes>> clothesMono = wearApiClient
                .get()
                .uri("/{feelsLikeStatus}/{gender}", feelsLikeStatus, gender)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Clothes>>() {});

        List<Clothes> clothes = clothesMono.block(REQUEST_TIMEOUT);
        return clothes.stream()
                .collect(Collectors.toList());
    }
}
