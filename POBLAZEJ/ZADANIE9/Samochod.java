package com.company;

public class Samochod {

    private final int ID;

    public Samochod(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "ID=" + ID +
                '}';
    }
}
