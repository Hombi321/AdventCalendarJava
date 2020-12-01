package com.adventcalender.adventcalender.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://adventskalender-hombi321.herokuapp.com"})
public class indexController {




    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
}