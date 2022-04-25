package com.example.jwtseminar.controller;

import com.example.jwtseminar.dto.AuthenticationRequest;
import com.example.jwtseminar.dto.AuthenticationResponse;
import com.example.jwtseminar.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping( "/authenticate")
public class AuthenticationController {

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping(value = "/auth")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        UserDetails userDetails = new User(authenticationRequest.getUsername(), authenticationRequest.getPassword(), new ArrayList<>());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
