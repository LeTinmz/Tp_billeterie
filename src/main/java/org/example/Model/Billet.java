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

    public int getNumeroPlace() {
        return numeroPlace;
    }

    public void setNumeroPlace(int numeroPlace) {
        this.numeroPlace = numeroPlace;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
