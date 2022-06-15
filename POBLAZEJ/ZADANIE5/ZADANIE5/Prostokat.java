package com.company;

public class Prostokat {
    double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double pole(){
        System.out.println("pole: " +a*b);
        return a*b;
    }

    public double obwod(){
        System.out.println("obwod: " +2*(a+b));
        return 2*(a+b);
    }

    public double przekatna(){
        System.out.println("przekatna: " +Math.sqrt(a*a+b*b));
        return Math.sqrt(a*a+b*b);
    }
}