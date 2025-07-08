package org.example.Model;

public class Billet {
    private int numeroPlace;
    private Client client;
    private Event event;
    private String type;

    public Billet(int numeroPlace, Client client, Event event, String type) {
        this.numeroPlace = numeroPlace;
        this.client = client;
        this.event = event;
        this.type = type;
    }


}
