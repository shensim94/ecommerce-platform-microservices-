package com.sshen_ecommerce.shopping_cart_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/cart")
public class ShoppingCartController {

    @GetMapping
    public ResponseEntity<?> getCart() {
        return ResponseEntity.ok(Map.of("Message", "Shopping cart service working!"));
    }
}
