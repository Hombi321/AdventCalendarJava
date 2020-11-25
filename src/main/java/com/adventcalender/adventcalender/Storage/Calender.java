package com.adventcalender.adventcalender.Storage;

import com.adventcalender.adventcalender.Model.CalenderDoor;

import java.util.ArrayList;
import java.util.List;

public class Calender {

    static private List<CalenderDoor> calederDoors = new ArrayList<CalenderDoor>();

   public List<CalenderDoor> getCalederDoors() {
        return calederDoors;
    }

    public void addDoor(CalenderDoor newDoor) {
        this.calederDoors.add(newDoor);
    }
}
