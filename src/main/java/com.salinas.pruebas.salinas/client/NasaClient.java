package com.salinas.pruebas.salinas.client;

import com.salinas.pruebas.salinas.response.ApodResponse;
import reactor.core.publisher.Mono;

public interface NasaClient {

    Mono<ApodResponse> getApod();

}
