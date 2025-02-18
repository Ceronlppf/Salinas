package com.salinas.pruebas.salinas.service;

import com.salinas.pruebas.salinas.response.ApodResponse;
import com.salinas.pruebas.salinas.response.DonkiResponse;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

public interface NasaService {

    Mono<ApodResponse> getApod();

    Mono<DonkiResponse> getDonki(String startDate, String endDate, String type);

}
