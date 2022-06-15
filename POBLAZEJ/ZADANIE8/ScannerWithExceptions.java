package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerWithExceptions {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException  {

        try {
            ;
            System.out.println("Number: ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                throw new IllegalArgumentException("Podaj liczbę większą od 0");
            } else {
                double sqrtNumber = Math.sqrt(number);
                System.out.println(sqrtNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("Nalezy podac liczbe ktora nie jest ciagiem znakow");
        }

        factorial(2);

        Adres adres = new Adres("dokad", 1, "tupta", "jez");

    }

    public static int factorial(int a) throws BlednaWartoscDlaSilniException {
        int result = 1;
        if (a <= 0) {
            throw new BlednaWartoscDlaSilniException("Nalezy podac liczbe wieksza od 0");
        } else {
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
        }

        return result;
    }
}
