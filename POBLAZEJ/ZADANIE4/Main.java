package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wariancja = "+wariancja());
        suma_elementow_tablicy();
        tablica_bol();
    }

    private static void suma_elementow_tablicy() {

        int[] tab = {1, 2, 3, 4, 5};
        int suma = 0;

        for(int i = 0; i < tab.length; i++){
            suma += tab[i];
        }

        for (int i :tab) {
            System.out.println(i);
        }

        int srednia = suma / tab.length;

        System.out.println("Suma = " + suma + " " + "Srednia = " + srednia);
    }
    public static void tablica_bol(){

        boolean[] tab= new boolean[20];

        for (int i = 0; i < tab.length; i++) {
            if(i%2==0) tab[i]= true;
            else tab[i]=false;
        }

        for (boolean i : tab) {
            System.out.println(i);
        }
    }
    public static double wariancja(){

        double[] pomiary = {1.2,6.8,10.7,3.47,9.48,3.14,2.71,6.3};

        double suma = 0;

        for (double i:pomiary) {
            suma += i;
        }

        double sr = suma/ pomiary.length;

        double w = 0;

        for (int i = 0; i < pomiary.length; i++) {
            w += Math.pow((pomiary[i]-sr),2)/(pomiary.length-1);
        }

        return w;
    }

}
