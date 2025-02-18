package com.salinas.pruebas.salinas.client.impl;

import com.salinas.pruebas.salinas.client.NasaClient;
import com.salinas.pruebas.salinas.response.ApodResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NasaClientImpl implements NasaClient {

    private final WebClient webClient;

    public NasaClientImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<ApodResponse> getApod() {
        return webClient.get()
                .uri("/planetary/apod")
                .retrieve()
                .bodyToMono(ApodResponse.class);
    }

}
