package org.example.Model;

public class Lieu extends Adresse {

    private int capacite;
    public Lieu(String rue, String ville, int capacite) {
        super(rue, ville);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
