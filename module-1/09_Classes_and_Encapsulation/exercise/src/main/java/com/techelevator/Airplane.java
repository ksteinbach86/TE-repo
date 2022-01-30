package com.techelevator;

public class Airplane {

    public String planeNumber;
    public int totalFirstClassSeats;
    public int bookedFirstClassSeats;
    public int totalCoachSeats;
    public int bookedCoachSeats;

// constructor

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }


    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }


    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    // the method...

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && totalNumberOfSeats <= getAvailableFirstClassSeats()) {
            bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
            return true;
        }

        if (!forFirstClass && totalNumberOfSeats <= getAvailableCoachSeats()) {
            bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
            return true;
        }



    return false;
}


}
