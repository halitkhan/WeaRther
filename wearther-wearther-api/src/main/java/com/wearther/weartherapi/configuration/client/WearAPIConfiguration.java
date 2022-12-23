package com.wearther.weartherapi.configuration.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WearAPIConfiguration {

    @Bean
    public WebClient wearApiClient(){
        return WebClient.create("http://localhost:8082/clothes");
    }
}
