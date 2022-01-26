package com.techelevator;

public class Person {
    private String fullName;
    private double netWorth;
    private int confidenceLevel;

    public Person(String fullName, double netWorth) {
        this.fullName = fullName;
        this.netWorth = netWorth;
        this.confidenceLevel = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public double getNetWorth() {
        confidenceLevel++;
        return netWorth;
    }
}
