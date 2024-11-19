package com.example.appointment.system.backend.utils;

import com.example.appointment.system.backend.dto.RegistrationUserDto;
import com.example.appointment.system.backend.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

    public User RegDtoToUser(RegistrationUserDto registrationUserDto) {
        // encode password for save
        String encodedPassword = passwordEncoder.encode(registrationUserDto.getPassword());
        User user = new User();
        user.setUsername(registrationUserDto.getUsername());
        user.setPassword(encodedPassword);
        return user;
    }
}