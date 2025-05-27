package com.sshen_ecommerce.notification_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/notifications")
public class NotificationController {

    @GetMapping
    public ResponseEntity<?> getNotifications() {
        return ResponseEntity.ok(Map.of("message", "Notification service works!"));
    }
}
