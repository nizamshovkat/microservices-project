package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "User with ID: " + id;
    }
}
