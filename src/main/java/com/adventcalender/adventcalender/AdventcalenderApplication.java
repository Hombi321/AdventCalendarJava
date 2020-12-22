package com.adventcalender.adventcalender;

import com.adventcalender.adventcalender.Controller.AdventController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdventcalenderApplication {

    public static void main(String[] args) {
        AdventController.insertDataToCalendar();
        SpringApplication.run(AdventcalenderApplication.class, args);



    }

}
