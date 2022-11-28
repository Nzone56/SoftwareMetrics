package com.example.parseCode.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class linterController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
