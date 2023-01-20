package com.example.docker.controller;

/*
    created by Atiye Mousavi
    Date: 1/12/2023
    Time: 10:34 AM
*/


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/getMsg")
    public String getMessage() {
        return "Docker Test Successful";
    }
}