package com.company;

public class Powiesc extends Ksiazka{

    protected String gatunek;

    public Powiesc(double strony, double rozdzialy, String tytul, String autor, String gatunek) {
        super(strony, rozdzialy, tytul, autor);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("gatunek: " +gatunek);
    }
}
