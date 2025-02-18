package com.salinas.pruebas.salinas.client;

import com.salinas.pruebas.salinas.response.ApodResponse;
import com.salinas.pruebas.salinas.response.DonkiResponse;
import reactor.core.publisher.Mono;

public interface NasaClient {

    Mono<ApodResponse> getApod();

    Mono<DonkiResponse> getDonki(String startDate, String endDate, String type);

}
