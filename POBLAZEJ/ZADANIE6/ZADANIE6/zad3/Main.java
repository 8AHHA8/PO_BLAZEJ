package com.company;

public class Main {

    public static void main(String[] args) {
        Ksiazka k1 = new Podrecznik(289, 9, "nasza fizyka", "Romuald Subieta", "Fizyka");
        Ksiazka k2 = new Powiesc(356, 12, "Tinteherz", "jemand dass ich nicht kenne", "Przygoda");
        Klient kl1 = new Klient("Wiesław","Paleta", 455867);
        Ksiegarnia ks1 = new Ksiegarnia(kl1, k1);


        ks1.spzedaj(kl1, k1);

    }
}
