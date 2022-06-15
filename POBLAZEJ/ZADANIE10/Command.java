package com.company;

public class Command {

    private String ciagZnakow;

    public Command(String ciagZnakow) {
        this.ciagZnakow = ciagZnakow;
    }

    public void operation() {
        System.out.println(this.ciagZnakow);
    }
}
