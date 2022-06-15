package com.company;

public class Gatunek {
    String nazwa_rodzaju, nazwa_gatunkowa, opis;
    int polchromosomu, polchromosomyx;

    public Gatunek(String nazwa_rodzaju, String nazwa_gatunkowa, String opis, int polchromosomu, int polchromosomyx) {
        this.nazwa_rodzaju = nazwa_rodzaju;
        this.nazwa_gatunkowa = nazwa_gatunkowa;
        this.opis = opis;
        this.polchromosomu = polchromosomu;
        this.polchromosomyx = polchromosomyx;
    }

    public void metoda1(){
        System.out.println("rodzaj: " +nazwa_rodzaju +" gatunek: " +nazwa_gatunkowa);
    }

    public void metoda2(){
        System.out.println(polchromosomu/2);
    }

    public void metoda3(){
        metoda1();
        System.out.println("opis" +opis +"polchromosomu" +polchromosomu +"polchromosomyx" +polchromosomyx);
    }

    public Gatunek metoda4(){
        Gatunek klon = new Gatunek(this.nazwa_rodzaju, this.nazwa_gatunkowa, this.opis, this.polchromosomu, this.polchromosomyx);
        return klon;
    }

}
