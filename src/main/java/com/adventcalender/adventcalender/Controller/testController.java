package com.adventcalender.adventcalender.Controller;

import com.adventcalender.adventcalender.Model.CalenderDoor;
import com.adventcalender.adventcalender.Storage.Calender;
import com.fasterxml.jackson.databind.ObjectReader;
import org.apache.tomcat.jni.Local;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.AbstractLocaleResolver;

import java.lang.invoke.CallSite;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/advent")
public class testController {
    static Calender c = new Calender();
    @GetMapping("test")
    public List<CalenderDoor> getUsers() throws Exception{
        List<CalenderDoor> users = c.getCalederDoors();

        return users;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("post")
    public CalenderDoor printMessage(@RequestParam(value = "date", required = true) final String date) throws Exception{
        //String day = params.substring(params.length() - 2);
        //int day2 = Integer.parseInt(day);
        //LocalDate date = LocalDate.of(2017, 12, day2);
        LocalDate n = LocalDate.parse(date);

       // LocalDate now = LocalDate.now();
       LocalDate now = LocalDate.of(2020,12,24);
        LocalDate transferedDate = LocalDate.parse(date);
        CalenderDoor door = null;
        if(now.isBefore(n)){

        door = new CalenderDoor(-1, "FAIL", null,  null);

        }else{



            for (CalenderDoor calenderDoors: c.getCalederDoors()) {
               if(calenderDoors.getDate().isEqual(transferedDate)){
                   door = calenderDoors;
                   break;
               }
            }

        }

return door;



    }


    // Dummy method for adding List of Users
    public static void insertDataToCalendar(){


        List <CalenderDoor> randomList = new ArrayList<>();

        CalenderDoor c1 = new CalenderDoor(1, "Bild", LocalDate.of(2020,12,1), "https://cdn.pixabay.com/photo/2019/11/25/09/02/baking-4651363_960_720.jpg");
        CalenderDoor c2 = new CalenderDoor(2, "Video", LocalDate.of(2020,12,2), "https://www.youtube.com/embed/Y7s5A2J7dMg");
        CalenderDoor c3 = new CalenderDoor(3, "Bild", LocalDate.of(2020,12,3),  "https://cdn.pixabay.com/photo/2017/02/14/03/03/ama-dablam-2064522_960_720.jpg");
        CalenderDoor c4 = new CalenderDoor(4, "Video", LocalDate.of(2020,12,4),  "https://www.youtube.com/embed/-AUE4ZrMItI");
        CalenderDoor c5 = new CalenderDoor(5, "Rezept", LocalDate.of(2020,12,5),  "https://www.swissmilk.ch/de/rezepte-kochideen/rezepte/LM201112_34/brunsli/");
        CalenderDoor c6 = new CalenderDoor(6, "Bild", LocalDate.of(2020,12,6),  "https://i.pinimg.com/originals/ec/c1/2b/ecc12bdd417f53fe4324e967b1a12b9a.jpg");
        CalenderDoor c7 = new CalenderDoor(7, "Bild", LocalDate.of(2020,12,7),  "https://i.pinimg.com/originals/f0/47/97/f04797385c24c98db149b752073f7d63.jpg");
        CalenderDoor c8 = new CalenderDoor(8, "Bild", LocalDate.of(2020,12,8),  "https://pbs.twimg.com/media/C0V8qZ-W8AAdz4O.jpg");
        CalenderDoor c9 = new CalenderDoor(9, "Video", LocalDate.of(2020,12,9),  "https://www.youtube.com/embed/E8gmARGvPlI");
        CalenderDoor c10 = new CalenderDoor(10, "Bild", LocalDate.of(2020,12,10),  "https://www.siliconrepublic.com/wp-content/uploads/2015/05/Bug-v-feature.jpg");
        CalenderDoor c11= new CalenderDoor(11, "Rezept", LocalDate.of(2020,12,11),  "https://www.swissmilk.ch/de/rezepte-kochideen/rezepte/HWL_BACKEN_1999_12/grittibaenze/");
        CalenderDoor c12 = new CalenderDoor(12, "Bild", LocalDate.of(2020,12,12),  "https://cdn.pixabay.com/photo/2016/11/24/14/00/christmas-tree-1856343_960_720.jpg");
        CalenderDoor c13= new CalenderDoor(13, "Video", LocalDate.of(2020,12,13),  "https://www.youtube.com/embed/VfLf7A_-1Vw");
        CalenderDoor c14= new CalenderDoor(14, "Bild", LocalDate.of(2020,12,14),  "https://res.cloudinary.com/teepublic/image/private/s--k3zvSQ65--/t_Preview/b_rgb:000000,c_limit,f_jpg,h_630,q_90,w_630/v1554272032/production/designs/4557261_0.jpg");
        CalenderDoor c15= new CalenderDoor(15, "Rezept", LocalDate.of(2020,12,15),  "https://migusto.migros.ch/de/rezepte/zimtsterne");
        CalenderDoor c16= new CalenderDoor(16, "Bild", LocalDate.of(2020,12,16),  "https://i.pinimg.com/564x/5e/10/e8/5e10e861268c1cf9b2ae2d0a326400d9--blond-jokes-computer-jokes.jpg");
        CalenderDoor c17= new CalenderDoor(17, "Video", LocalDate.of(2020,12,17),  "https://www.youtube.com/embed/PtQWaq2_DCM");
        CalenderDoor c18 = new CalenderDoor(18, "Bild", LocalDate.of(2020,12,18),  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQenGQTTZg-67xl-u1F6E5pYHlWYJ_G0TI9sg&usqp=CAU");
        CalenderDoor c19 = new CalenderDoor(19, "Rezept", LocalDate.of(2020,12,19),  "https://www.swrfernsehen.de/landesschau-bw/rezepte/rezept-lebkuchenmuffins-100.html");
        CalenderDoor c20 = new CalenderDoor(20, "Bild", LocalDate.of(2020,12,20),  "https://i.pinimg.com/originals/6e/f0/bc/6ef0bc2a3298187807efa501cb05a375.jpg");
        CalenderDoor c21 = new CalenderDoor(21, "Bild", LocalDate.of(2020,12,21),  "https://i.imgur.com/42bJQDS.png");
        CalenderDoor c22 = new CalenderDoor(22, "Rezept", LocalDate.of(2020,12,22),  "https://fooby.ch/de/rezepte/18551/aperokranz?startAuto1=0");
        CalenderDoor c23 = new CalenderDoor(23, "Video", LocalDate.of(2020,12,23),  "https://www.youtube.com/embed/KHjiCp7f0D4");
        CalenderDoor c24 = new CalenderDoor(24, "Bild", LocalDate.of(2020,12,24), "https://cdn.pixabay.com/photo/2017/10/21/09/38/christmas-2874137_960_720.jpg");


        c.addDoor(c10);
        c.addDoor(c7);
        c.addDoor(c23);
        c.addDoor(c8);
        c.addDoor(c6);
        c.addDoor(c21);
        c.addDoor(c12);
        c.addDoor(c3);
        c.addDoor(c22);
        c.addDoor(c15);
        c.addDoor(c2);
        c.addDoor(c4);
        c.addDoor(c5);
        c.addDoor(c11);
        c.addDoor(c1);
        c.addDoor(c16);
        c.addDoor(c19);
        c.addDoor(c13);
        c.addDoor(c24);
        c.addDoor(c9);
        c.addDoor(c18);
        c.addDoor(c20);
        c.addDoor(c14);
        c.addDoor(c17);

    }


}
