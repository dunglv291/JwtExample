package com.example.jwtseminar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/**
 *
 * @author dunglv
 */
public class AuthenticationRequest {
    private String username;
    private String password;
}
