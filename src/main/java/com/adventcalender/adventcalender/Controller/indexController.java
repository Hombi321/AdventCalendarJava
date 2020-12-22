package com.adventcalender.adventcalender.Controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@ApiOperation(value = "Index Controller")
@RequestMapping("/advent")
@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://adventskalenderapp.herokuapp.com"})
public class indexController {




    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
}