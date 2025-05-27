package com.sshen_ecommerce.payment_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public ResponseEntity<?> getPayments() {
        return ResponseEntity.ok(Map.of("message", "Payment service works!"));
    }
}
