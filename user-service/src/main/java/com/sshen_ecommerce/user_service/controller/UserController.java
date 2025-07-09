package com.sshen_ecommerce.user_service.controller;

import com.sshen_ecommerce.user_service.dto.AuthResponseDTO;
import com.sshen_ecommerce.user_service.dto.LoginDTO;
import com.sshen_ecommerce.user_service.dto.UserDTO;
import com.sshen_ecommerce.user_service.dto.UserRegistrationDTO;
import com.sshen_ecommerce.user_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map; // Or create a simple UserDTO class

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(Map.of("message", "User service working!"));
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@Valid @RequestBody UserRegistrationDTO registrationDTO) {
        UserDTO user = userService.registerUser(registrationDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@Valid @RequestBody LoginDTO loginDTO) {
        AuthResponseDTO authResponse = userService.authenticate(loginDTO);
        return ResponseEntity.ok(authResponse);
    }
}
