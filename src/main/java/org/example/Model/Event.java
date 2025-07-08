package org.example.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private Lieu place;
    private LocalDate date;
    private LocalTime time;
    private int nbrPlaces;
    private List<Billet> billets;

    public Event(String name, Lieu place, LocalDate date, LocalTime time, int nbrPlaces) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.time = time;
        this.nbrPlaces = nbrPlaces;
        this.billets = new ArrayList<>();
    }

    public void displayTickets(){
        for(Billet billet : billets){
            System.out.println(billet);
        }
    }

}
