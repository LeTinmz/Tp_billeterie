package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String first_name;
    private String last_name;
    private Adresse adresse;
    private int age;
    private int phone;
    private List<Billet> billets;

    public Client(String first_name, String last_name, Adresse adresse, int age, int phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.adresse = adresse;
        this.age = age;
        this.phone = phone;
        this.billets = new ArrayList<>();
    }

    public void reserverBillet(Event event) {
        if (!event.verifDispo()) {
            System.out.println("Apluplaces");
            return;
        }

        for (Billet billet : event.getBillets()) {
            if (billet.getClient() == null) {
                billet.setClient(this);
                billets.add(billet);
                return;

            }
        }
    }
}
