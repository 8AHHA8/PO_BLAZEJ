package ZADANIE2;

import java.util.Scanner;

public class Samochod {
    String Marka, Model, Nadwozie, Kolor;
    int Rokprodukcji, Przebieg;


    public Samochod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wczytaj marke auta: ");
        this.Marka = scanner.nextLine();


        System.out.println("Wczytaj model auta: ");
        this.Model = scanner.nextLine();


        System.out.println("Wczytaj nadwozie auta: ");
        this.Nadwozie = scanner.nextLine();


        System.out.println("Wczytaj kolor auta: ");
        this.Kolor = scanner.nextLine();


        System.out.println("Wczytaj rokprodukcji auta: ");
        this.Rokprodukcji = scanner.nextInt();

        do {
            System.out.println("Wczytaj przebieg auta: ");
            this.Przebieg = scanner.nextInt();
        }while(Przebieg<0);
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokprodukcji, int przebieg) {
        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        Rokprodukcji = rokprodukcji;
        Przebieg = przebieg;
    }

    public String opis() {
        return "Samochod{" +
                "Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Nadwozie='" + Nadwozie + '\'' +
                ", Kolor='" + Kolor + '\'' +
                ", Rokprodukcji=" + Rokprodukcji +
                ", Przebieg=" + Przebieg +
                '}';
    }
}
