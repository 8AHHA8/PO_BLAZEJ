package com.company;

public class Ksiazka {

    protected double Strony;
    protected double Rozdzialy;
    protected String Tytul;
    protected String Autor;

    public Ksiazka(double strony, double rozdzialy, String tytul, String autor) {
        Strony = strony;
        Rozdzialy = rozdzialy;
        Tytul = tytul;
        Autor = autor;
    }

    public double getStrony() {
        return Strony;
    }

    public void setStrony(double strony) {
        Strony = strony;
    }

    public double getRozdzialy() {
        return Rozdzialy;
    }

    public void setRozdzialy(double rozdzialy) {
        Rozdzialy = rozdzialy;
    }

    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String tytul) {
        Tytul = tytul;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void wyrywamykartkiirozdzialy(){
        this.Strony=0;
        this.Rozdzialy=0;
    }

    public void opis(){
        System.out.println("ksiazka ma " +Strony +"stron i " +Rozdzialy +"rozdzialow, oraz jest autorstwa: " +Autor +", a tytul to: " +Tytul);
    }

    public void dopisujemy(){
        this.Strony +=Strony;
        this.Rozdzialy +=Rozdzialy;
    }

}
