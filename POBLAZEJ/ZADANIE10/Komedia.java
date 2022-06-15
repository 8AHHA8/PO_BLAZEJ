package com.company;

public class Komedia extends Film{

    private static final String type = "Komedia";

    public Komedia(int duration, boolean isWatched) {
        super(duration, isWatched);
    }

    @Override
    public String info() {
        return super.info() + " " + this.type;
    }
}
