package com.devfamz.spring_boot_mysql_docker.controllers;

import com.devfamz.spring_boot_mysql_docker.authconfig.jwt.JwtService;
import com.devfamz.spring_boot_mysql_docker.authconfig.jwt.LoginForm;
import com.devfamz.spring_boot_mysql_docker.service.UserDetailService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private AuthenticationManager authenticationManager;
    private JwtService jwtService;
    private UserDetailService userDetailService;

    public AuthController(AuthenticationManager authenticationManager, JwtService jwtService, UserDetailService userDetailService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.userDetailService = userDetailService;
    }

    @PostMapping("/authenticate")
    public String authenticationAndGetToken(@RequestBody LoginForm loginForm) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginForm.username(), loginForm.password()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(userDetailService.loadUserByUsername(loginForm.username()));
        } else {
            throw new UsernameNotFoundException("Invalid Credentials");
        }
    }
}
