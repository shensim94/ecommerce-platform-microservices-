package com.sshen_ecommerce.user_service.service;

import com.sshen_ecommerce.user_service.dto.AuthResponseDTO;
import com.sshen_ecommerce.user_service.dto.LoginDTO;
import com.sshen_ecommerce.user_service.dto.UserDTO;
import com.sshen_ecommerce.user_service.dto.UserRegistrationDTO;

public interface UserService {

    UserDTO registerUser(UserRegistrationDTO registrationDTO);

    UserDTO getUserById(Long id);

    UserDTO getUserByEmail(String email);

    void deleteUser(Long id);

    AuthResponseDTO authenticate(LoginDTO loginDTO);
}
