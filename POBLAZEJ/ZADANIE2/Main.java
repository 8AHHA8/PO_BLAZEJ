package com.company;

import java.util.Scanner;

import java.lang.String;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj b: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj c: ");
        double c = scanner.nextDouble();
        pierwiastki(a, b, c);
        System.out.println(x(8));
        System.out.println(y(2));
        System.out.println(z(1));
        segregacja_rasowa(a,b,c);

        System.out.println("pada deszcz?(odpowiedz 1/0)");
        double t = scanner.nextDouble();
        System.out.println("jest bus?(odpowiedz 1/0)");
        double n = scanner.nextDouble();

        deszcze_niespokojne(t, n);

        System.out.println("jest znizka?(odpowiedz 1/0)");
        double l = scanner.nextDouble();
        System.out.println("masz premie?(odpowiedz 1/0)");
        double k = scanner.nextDouble();

        AUTA(l, k);

        System.out.println("Wybierz operacje ktora chcesz wykonac na jednorazowym kalkulatorze wybierajac jej numer \n" +
                "Dodawanie - 1\n" +
                "Odejmowanie - 2\n" +
                "Iloczyn - 3\n" +
                "Iloraz - 4\n");
        double u = scanner.nextDouble();
        System.out.println("wprowadz 2 liczby");
        double v = scanner.nextDouble();
        double m = scanner.nextDouble();

        kalkulatoror(u, v, m);

    }

    public static void pierwiastki(double a, double b, double c) {
        double x1;
        double x2;
        double x0;

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("nie jest to rownanie kwadratowe");
        } else {
            if (delta < 0) {
                System.out.println("nie ma miejsc zerowych");
            } else if (delta == 0) {
                System.out.println("jedno miejsce zero, rowne: ");
                x0 = -b / (2 * a);
                System.out.println(x0);
            } else {
                System.out.println("miejsca zerowe to: ");
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }

    private static int x(int i) {

        if (i > 0) {
            return 2 * i;
        } else if (i == 0) {
            return 0;
        } else {
            return -3 * i;
        }
    }

    private static int y(int i) {
        if (i >= 1) {
            return i * i;
        } else {
            return i;
        }
    }

    private static int z(int i) {
        if (i > 2) {
            return 2 + i;
        } else if (i == 2) {
            return 8;
        } else {
            return i - 4;
        }
    }

    public static void segregacja_rasowa(double x, double y, double z)
    {
        double max = Math.max(x, y);
        double min = Math.min(x, y);
        double average = 0;

        if(max<z){
            max=z;
            average = Math.max(x,y);
        }
        if(min > z)
        {
            min =z;
            average = Math.min(x, y);
        }
        System.out.println(min + " " + average + " " + max);

    }

    public static void deszcze_niespokojne(double t, double n)
    {
        boolean pada_deszcz;
        boolean bus;

        if(t != 1)
            pada_deszcz = false;
        else
            pada_deszcz = true;

        if(n != 1)
            bus = false;
        else
            bus = true;

        if(pada_deszcz == true && bus == true)
            System.out.println("wez parasol, dostaniesz sie na uczelnie");

        if(pada_deszcz == true && bus == false)
            System.out.println("wez parasol, nie dostaniesz sie na uczelnie");

        if(pada_deszcz == false && bus == true)
            System.out.println("dostaniesz się na uczelnie, milego dnia i pieknej pogody");

    }

    public static void AUTA(double l, double k)
    {
        boolean znizka;
        boolean premia;

        if(l != 1)
            znizka = false;
        else
            znizka = true;

        if(k != 1)
            premia = false;
        else
            premia = true;

        if(znizka == false || premia == true)
            System.out.println("możesz kupić samochód, zniżki na samochód nie ma");

        if(znizka == false || premia == false)
            System.out.println("zakup samochód trzeba odłożyć na później, zniżki na samochód nie ma");

        if(znizka == true || premia == true)
            System.out.println("możesz kupić samochód");
    }


    public static double kalkulatoror(double u, double v, double m)
    {
        if(u == 1)
            System.out.println(v+m);
        else if(u == 2)
            System.out.println(v-m);
        else if(u == 3)
            System.out.println(v*m);
        else if(u == 4)
            System.out.println(v/m);

        return 0;
    }

}
