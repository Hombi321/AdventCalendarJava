package com.adventcalender.adventcalender.Model;

import java.time.LocalDate;
import java.util.Date;

public class CalenderDoor {

    private int id;
    private String type;
    private LocalDate date;
    private String link;



    public CalenderDoor(int id, String type, LocalDate date, String src){
        this.id = id;
        this.type = type;
        this.date = date;
        this.link = src;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
