package com.company;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args) {
        Budynek bud = new Budynek(LocalDate.parse("1863-08-08"), "kiosk", 2);
        bud.info();

        Gatunek gat = new Gatunek(" żaba "," zielona żaba ", " taka fajna ", 23, 1);

        gat.metoda1();
        gat.metoda2();
        gat.metoda3();

        Gatunek but = gat.metoda4();

        Prostokat prosty = new Prostokat(20, 40);

        prosty.pole();
        prosty.obwod();
        prosty.przekatna();
    }
}
