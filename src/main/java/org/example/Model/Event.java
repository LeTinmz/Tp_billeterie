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

        generateBillets();
    }

    private void generateBillets() {
        for (int i = 1; i <= nbrPlaces; i++) {
            this.billets.add(new Billet(i, null, this, "standard"));
        }
    }

    public boolean verifDispo() {
        return billets.stream().anyMatch(b -> b.getClient() == null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lieu getPlace() {
        return place;
    }

    public void setPlace(Lieu place) {
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public List<Billet> getBillets() {
        return billets;
    }

    public void displayTickets(){
        for(Billet billet : billets) {
            System.out.println(billet.getEvent().getName());
            System.out.println(billet.getNumeroPlace());

        }
    }

    public void addBillet(Billet billet) {
        billets.add(billet);
    }

}
