package com.example.samplecw.api_controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {

    @GetMapping("/api/messege")
    public String message() {
        return "Hello World from back end";
    }
}
