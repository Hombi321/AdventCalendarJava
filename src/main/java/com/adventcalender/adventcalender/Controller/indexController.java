package com.adventcalender.adventcalender.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
}