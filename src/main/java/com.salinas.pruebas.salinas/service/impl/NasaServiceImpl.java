package com.salinas.pruebas.salinas.service.impl;

import com.salinas.pruebas.salinas.client.NasaClient;
import com.salinas.pruebas.salinas.response.ApodResponse;
import com.salinas.pruebas.salinas.response.DonkiResponse;
import com.salinas.pruebas.salinas.service.NasaService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NasaServiceImpl implements NasaService{

    private final NasaClient nasaClient;

    public NasaServiceImpl(NasaClient nasaClient) {
        this.nasaClient = nasaClient;
    }

    @Override
    public Mono<ApodResponse> getApod() {
        return nasaClient.getApod();
    }

    @Override
    public Mono<DonkiResponse> getDonki(String startDate, String endDate, String type) {
        return nasaClient.getDonki(startDate, endDate, type);
    }

}
