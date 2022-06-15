package com.company;

public class Podrecznik extends Ksiazka{

    String przedmiot;

    public Podrecznik(double strony, double rozdzialy, String tytul, String autor, String przedmiot) {
        super(strony, rozdzialy, tytul, autor);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("przedmiot: " +przedmiot);
    }
}
