package com.company;

public class Klient{

    protected String imie, nazwisko;
    protected int numkarty;

    public Klient(String imie, String nazwisko, int numkarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numkarty = numkarty;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumkarty() {
        return numkarty;
    }

    public void setNumkarty(int numkarty) {
        this.numkarty = numkarty;
    }

    public void opis() {
        System.out.println("Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numkarty=" + numkarty +
                '}');
    }
}
