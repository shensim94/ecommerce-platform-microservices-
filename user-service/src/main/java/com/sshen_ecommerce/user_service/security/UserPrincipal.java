package com.sshen_ecommerce.user_service.security;

public class UserPrincipal {
    private Long userID;
    private String email;
    private String role;

    public UserPrincipal(Long userID, String email, String role) {
        this.userID = userID;
        this.email = email;
        this.role = role;
    }

    public Long getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
