package com.company;

public class Ksiegarnia{

    protected Klient klient;
    protected Ksiazka ksiazka;

    public Ksiegarnia(Klient klient, Ksiazka ksiazka) {
        this.klient = klient;
        this.ksiazka = ksiazka;
    }

    public void spzedaj(Klient klient, Ksiazka ksiazka){
        System.out.print(" klient ");
        klient.opis();
        System.out.print(" kupil ");
        ksiazka.opis();
    }
}
