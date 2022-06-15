package com.company;

import java.util.Random;
import java.util.Scanner;

import java.lang.String;
import java.util.random.RandomGenerator;

public class Main {

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Wczytaj liczbe studentow: ");
        double x = wczytaj.nextDouble();
        zad1(x);

        zad2();

        Scanner elementy = new Scanner(System.in);
        System.out.println("Wczytaj wielkosc talbicy: ");
        int t = elementy.nextInt();
        zad3(t);

        Scanner loteria = new Scanner(System.in);
        System.out.println("Wczytaj wielkosc kolejnej talbicy: ");
        int h = loteria.nextInt();
        zad4(h);

        Scanner palindromy = new Scanner(System.in);
        System.out.println("Podaj slowo, ktore zostanie sprawdzone pod katem tego czy jest palindromem: ");
        String c = palindromy.next();
        zad5(c);
    }

    public static void zad1(double a) {
        Scanner punktow_wiele = new Scanner(System.in);
        double suma = 0, srednia = 0, i = 0;

        while (i < a) {
            System.out.println("Wczytaj liczbe punktow odpowiadajaca studentowi: ");
            double b = punktow_wiele.nextDouble();
            suma = suma + b;
            i++;
        }
        srednia = suma / a;
        System.out.println(srednia);
    }

    public static void zad2() {
        Scanner wybor = new Scanner(System.in);
        int[] tab = new int[10];
        int suma_ujemna = 0;
        int suma_dodatnia = 0;

        System.out.println("wprowadz 10 losowych liczb");

        for (int i = 0; i < tab.length; i++) {
            tab[i] = wybor.nextInt();
            if (tab[i] < 0) {
                suma_ujemna = suma_ujemna + tab[i];
            } else {
                suma_dodatnia = suma_dodatnia + tab[i];
            }
        }

        System.out.println("Suma liczb ujemnych to: ");
        System.out.println(suma_ujemna);
        System.out.println("Suma liczb dodatnich to: ");
        System.out.println(suma_dodatnia);
    }

    public static void zad3(int a) {
        Scanner elementy = new Scanner(System.in);
        int[] tab = new int[a];
        int suma_parzysta_danego_ciagu = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = elementy.nextInt();
            if (tab[i] % 2 == 0) {
                System.out.println("parzysta");
                suma_parzysta_danego_ciagu = suma_parzysta_danego_ciagu + tab[i];
            } else
                System.out.println("nieparzysta");
        }
        System.out.println("suma wszystkich liczb parzystych w tym ciagu to: ");
        System.out.println(suma_parzysta_danego_ciagu);
    }

    public static void zad4(int a) {
        int[] tab = new int[a];
        int n = 0;
        int suma_parzysta_danego_ciagu = 0;

        for (int i = 0; i < tab.length; i++) {
            Random random = new Random();
            n = -10 + random.nextInt(56);
            tab[i] = n;
            if (tab[i] % 2 == 0) {
                suma_parzysta_danego_ciagu = suma_parzysta_danego_ciagu + tab[i];
                System.out.println(tab[i]);
            }
        }
        System.out.println("suma wszystkich liczb parzystych w tym ciagu to: ");
        System.out.println(suma_parzysta_danego_ciagu);
    }

    public static boolean zad5(String a) {
        for (int i = 0; i < a.length() / 2; i++)
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                System.out.println("slowo nie jest palindromem");
                return false;
            } else {
                System.out.println("slowo jest palindromem");
            }
        return true;
    }
}
