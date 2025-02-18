package com.salinas.pruebas.salinas.controller;

import com.salinas.pruebas.salinas.response.ApodResponse;
import com.salinas.pruebas.salinas.service.NasaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test/api/nasa")
public class NasaController {

    private final NasaService nasaService;

    public NasaController(NasaService nasaService) {
        this.nasaService = nasaService;
    }

    @GetMapping
    public Mono<ApodResponse> getApod(){
        System.out.println("apod");
        return nasaService.getApod();
    }

}
