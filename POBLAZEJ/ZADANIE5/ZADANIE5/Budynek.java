package com.company;

import java.time.LocalDate;

public class Budynek {
    LocalDate rok_budowy;
    String nazwa;
    int polpietro;

    public Budynek(LocalDate rok_budowy, String nazwa, int polpietro) {
        this.rok_budowy = rok_budowy;
        this.nazwa = nazwa;
        this.polpietro = polpietro;
    }

    public void info(){
        System.out.println(rok_budowy);
        System.out.println(nazwa);
        System.out.println(polpietro);
    }
}
