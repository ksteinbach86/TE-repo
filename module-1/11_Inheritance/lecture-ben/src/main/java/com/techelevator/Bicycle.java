package com.techelevator;

public class Bicycle {
    int wheels;
    int seats;
    int handles;
    int pedals;
    int riders;
    Bell bell;

    public Bicycle() {
        this(2, 1, 1, 2, 1);
    }

    public Bicycle(int wheels, int seats, int handles, int pedals, int riders) {
        this.wheels = wheels;
        this.seats = seats;
        this.handles = handles;
        this.pedals = pedals;
        this.riders = riders;
        bell = null;
    }

    public void go(int meters) {

    }

    public void addBell() {
        this.bell = new Bell();
    }

    public void ringBell() {
        if (bell != null) {
            bell.ring();
        }
    }



}
