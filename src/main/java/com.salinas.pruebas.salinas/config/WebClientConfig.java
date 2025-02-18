package com.salinas.pruebas.salinas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://api.nasa.gov") // URL base de la API
               // .defaultHeader("Content-Type", "application/json")
                .defaultHeader("x-api-key", "fh7BApLHm3aS3nVcq8JdDkoxe4kdWd0MIEYIk1St")
                .build();
    }
}

