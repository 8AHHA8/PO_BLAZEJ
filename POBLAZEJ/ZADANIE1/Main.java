package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        imie("Błażej",21);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = input.nextDouble();
        System.out.println("Podaj b: ");
        double b = input.nextDouble();

        dzialania(a,b);

        if(parzysta(a)){
            System.out.println("liczba a jest parzysta");
        }else System.out.println("liczba a jest nieparzysta");

        if(podzielna(b)){
            System.out.println("liczba b jest podzielna przez 3 i 5");
        }else System.out.println("liczba b nie jest podzielna przez 3 i 5");

        System.out.println("liczba a do potegi 3 to: "+potega(a));

        System.out.println("pierwiastek z liczby b to: "+pierwiastek(b));

        double x,y,z;

        x = Math.floor(Math.random()*(b-a+1)+a);
        y = Math.floor(Math.random()*(b-a+1)+a);
        z = Math.floor(Math.random()*(b-a+1)+a);
        System.out.println("x: "+x+"  y: "+y+"  z: "+z);

        if(trojkat(x,y,z)){
            System.out.println("mozna zbudowac trojkat");
        }else System.out.println("nie mozna zbudowac trojkatu");

    }

    public static void imie(String imie, int wiek){
        System.out.println("imie: "+imie+"  wiek: "+wiek);
    }

    public static void dzialania (double a, double b){
        System.out.println("suma: "+(a+b)+"  roznica: "+(a-b)+"  iloraz: "+(a*b));
    }

    public static boolean parzysta (double a){
        return a % 2 == 0;
    }

    public static boolean podzielna(double a){
        return a % 5 == 0 && a % 3 == 0;
    }

    public static double potega(double a){
        return Math.pow(a,3);
    }

    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }

    public static boolean trojkat(double a,double b,double c){
        if((a*a)+(b*b)==(c*c)){
            return true;
        }else if((a*a)+(c*c)==(b*b)){
            return true;
        }else return (c * c) + (b * b) == (a * a);
    }


}
