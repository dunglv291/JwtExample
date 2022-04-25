package com.example.jwtseminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class JwtSeminarApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSeminarApplication.class, args);
    }

}
