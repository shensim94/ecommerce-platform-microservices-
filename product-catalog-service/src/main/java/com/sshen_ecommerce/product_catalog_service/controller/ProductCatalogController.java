package com.sshen_ecommerce.product_catalog_service.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/products")
public class ProductCatalogController {

    @GetMapping
    public ResponseEntity<?> getProducts() {
        // In a real scenario: Call service layer to fetch products
        return ResponseEntity.ok(Map.of("message", "product catalog service works!"));
    }
}
