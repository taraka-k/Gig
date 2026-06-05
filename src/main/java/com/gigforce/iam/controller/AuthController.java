package com.gigforce.iam.controller;

import com.gigforce.iam.dto.UserRequestDTO;
import com.gigforce.iam.entity.User;
import com.gigforce.iam.repository.UserRepository;

import com.gigforce.iam.security.CustomUserDetails;
import com.gigforce.iam.service.CustomUserDetailsService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private CustomUserDetailsService cds;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/register")
    public User register(@Valid @RequestBody User user) {
        return cds.createUser(user);
    }
}