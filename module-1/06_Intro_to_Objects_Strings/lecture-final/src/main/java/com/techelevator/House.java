package com.techelevator;

public class House {
    private int bedrooms;
    private int fullBathrooms;
    private int halfBathrooms;
    private String outsideCovering;

    // Constructors
    public House() {
        System.out.println("Inside default constructor");
        bedrooms = 1;
        fullBathrooms = 1;
        halfBathrooms = 0;
        outsideCovering = "Blue paint";
    }

    public House(int bedrooms, int fullBathrooms, int halfBathrooms, String covering) {
        this.bedrooms = bedrooms;
        this.halfBathrooms = halfBathrooms;
        this.fullBathrooms = fullBathrooms;
        this.outsideCovering = covering;
    }

    // getter
    public int getBedrooms() {
        return this.bedrooms;
    }

    public int getBathrooms() {
        return this.fullBathrooms+this.halfBathrooms;
    }

    public String getOutsideCovering() {
        return outsideCovering;
    }

    // setters
    private void setBedrooms(int bedrooms) {
        // Special rules here
        this.bedrooms = bedrooms;
    }

    private void setFullBathrooms(int fullBathrooms) {
        this.fullBathrooms = fullBathrooms;
    }

    private void setHalfBathrooms(int halfBathrooms) {
        this.halfBathrooms = halfBathrooms;
    }

    public void setOutsideCovering(String outsideCovering) {
        this.outsideCovering = outsideCovering;
    }

    public boolean buildAddition(int newBedrooms, int newFullBathrooms, int newHalfBathrooms) {
        if (newBedrooms < 0 || newFullBathrooms < 0 || newHalfBathrooms < 0) {
            return false;
        }

        // special rules

        setBedrooms(bedrooms + newBedrooms);
        setFullBathrooms(fullBathrooms + newFullBathrooms);
        setHalfBathrooms(halfBathrooms + newHalfBathrooms);
        return true;
    }
}

public class TownHouse extends House {
    double hoaFee;
}
