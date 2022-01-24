package com.techelevator;

public class House {
    public int bedrooms;
    private int fullBathrooms;
    private int halfBathrooms;
    private String outsideCovering;


    //constructors
    public House() {
        System.out.println("Inside default constructor");;
    }

    public House(int bedrooms, int fullBathrooms, int halfBathrooms, String covering) {
        this.bedrooms = bedrooms;
        this.halfBathrooms = halfBathrooms;
        this.fullBathrooms = fullBathrooms;
        this.outsideCovering = covering;
    }


    //getter
    public int getBedrooms() {
        return bedrooms;

    }


    //setters
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;

    }



}
