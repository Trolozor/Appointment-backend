package com.example.appointment.system.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrationUserDto {
    private String username;
    private String password;
    private String confirmPassword;
}