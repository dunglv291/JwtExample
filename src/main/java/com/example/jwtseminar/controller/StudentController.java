package com.example.jwtseminar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author dunglv
 */
@RestController
@RequestMapping( "/student")
public class StudentController {

    @GetMapping(value = "/getName")
    public ResponseEntity<?> createAuthenticationToken(){
        return ResponseEntity.ok("dunglv");
    }
}
