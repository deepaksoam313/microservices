package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="cards", fallback = CardsFallback.class)// name registered with Eureka Server
public interface CardsFeignClient {

    @GetMapping(value ="api/fetch", consumes = "application/json")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("eazybank-correlation-id")
                                                         String correlationId,
                                                     @RequestParam String mobileNumber);
}
