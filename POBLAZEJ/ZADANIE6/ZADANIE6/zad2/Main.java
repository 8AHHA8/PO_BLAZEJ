package ZADANIE2;

public class Main {

    public static void main(String[] args) {
        Samochod sam1 = new Samochod();
        Samochod sam2 = new Samochod("ford", "ladny", "duze", "kolorowy", 2007, 1000);
        SamochodOsobowy samos = new SamochodOsobowy();

        System.out.println(samos.opis());
        System.out.println(sam1.opis());
        System.out.println(sam2.opis());
    }
}
