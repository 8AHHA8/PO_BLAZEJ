package com.company;

public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;


    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException  {
        if(ulica == null) {
            throw new NieprawidlowyAdresException ("Ulica  nie  może  być  nullem");
        } else {
            this.ulica = ulica;
        }
        if(numerDomu <= 0) {
            throw new NieprawidlowyAdresException ("Numer domu nie moze byc liczba mniejsza od 0");
        }else {
            this.numerDomu = numerDomu;
        }
        if(kodPocztowy == null) {
            throw new NieprawidlowyAdresException ("kod pocztowy nie moze byc nullem");
        } else {
            this.kodPocztowy = kodPocztowy;
        }
        if(miasto == null) {
            throw new NieprawidlowyAdresException ("Miasto  nie  może  byćnullem");
        } else {
            this.miasto = miasto;
        }
    }
}
