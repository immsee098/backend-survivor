package com.hs.http.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, World";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hello, World";
    }
}
