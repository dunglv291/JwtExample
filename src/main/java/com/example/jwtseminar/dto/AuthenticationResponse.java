package com.example.jwtseminar.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dunglv
 */
@AllArgsConstructor
@Getter
@Setter
public class AuthenticationResponse {
    private final String jwt;
}
