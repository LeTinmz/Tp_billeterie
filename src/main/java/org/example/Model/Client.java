package org.example.Model;

import org.example.Exceptions.NotFoundException;

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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void reserverBillet(Event event) {
        try {

            event.verifDispo();


            for (Billet billet : event.getBillets()) {
                if (billet.getClient() == null) {
                    billet.setClient(this);
                    billets.add(billet);
                    return;
                }
            }

        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
