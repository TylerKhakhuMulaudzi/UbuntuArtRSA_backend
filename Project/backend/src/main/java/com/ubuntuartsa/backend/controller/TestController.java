package com.ubuntuartsa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public Map<String,String> hello(){
        Map<String,String> response = new HashMap<>();
        response.put("message","UbuntuArtSA BackEnd is running");
        response.put("status","success \n entering the Batcave");
        response.put("timeskip", java.time.LocalDateTime.now().toString());
        return response;
    }
}
