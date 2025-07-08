package org.example;

import org.example.Model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private List<Event> events;



    public static void main(String[] args) {



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Adresse testAdresse = new Adresse("40 rue Leon Blum", "Lyon");
        Client testclient = new Client("tata","toto",testAdresse,25, 26459);
        Lieu testLieu = new Lieu("prout","caca",1500);
        Event testEvent = new Event("coucou",testLieu, LocalDate.parse("2025-08-25"), LocalTime.parse("20:30"),1500);

       testEvent.displayTickets();
    }
}