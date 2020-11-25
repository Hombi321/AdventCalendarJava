package com.adventcalender.adventcalender;

import com.adventcalender.adventcalender.Controller.testController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdventcalenderApplication {

    public static void main(String[] args) {
        testController.insertDataToCalendar();
        SpringApplication.run(AdventcalenderApplication.class, args);



    }

}
