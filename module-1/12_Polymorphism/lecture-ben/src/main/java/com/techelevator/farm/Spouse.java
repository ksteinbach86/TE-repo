package com.techelevator.farm;

public class Spouse implements Singable {
    private String name;
    private String sound;

    public Spouse() {
        this.name = "Spouse";
        this.sound = "Dinner!!";
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

}
