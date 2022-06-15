package ZADANIE2;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    int Waga, Pojemnoscsilnika, Iloscosob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokprodukcji, int przebieg, int waga,int pojemnoscsilnika, int iloscosob) {
        super();
        Waga = waga;
        Pojemnoscsilnika = pojemnoscsilnika;
        Iloscosob = iloscosob;

    }

    public SamochodOsobowy() {
        super();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wczytaj wage auta: ");
            this.Waga = scanner.nextInt();
        }while(Waga < 2 || Waga > 4.5);

        do {
            System.out.println("Wczytaj pojemnoscsilnika auta: ");
            this.Pojemnoscsilnika = scanner.nextInt();
        }while(Pojemnoscsilnika<0.8 || Pojemnoscsilnika>3);

        System.out.println("Wczytaj iloscosob: ");
        this.Iloscosob = scanner.nextInt();
    }

    @Override
    public String opis() {
        return super.opis() + Waga +" " + Pojemnoscsilnika +" " + Iloscosob;
    }
}
