package com.fernando.sistemahomebanking.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping(value = "/users")
    public List<String> GetUsers(){
        return List.of("Fernando", "Pedro");
    }
}
