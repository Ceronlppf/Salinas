package com.salinas.pruebas.salinas.service;

import com.salinas.pruebas.salinas.response.ApodResponse;
import reactor.core.publisher.Mono;

public interface NasaService {

    Mono<ApodResponse> getApod();

}
