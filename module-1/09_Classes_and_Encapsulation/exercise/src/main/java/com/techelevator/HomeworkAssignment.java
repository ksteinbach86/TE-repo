package com.techelevator;

public class HomeworkAssignment {

// int variables
    private int earnedMarks;
    private final int possibleMarks;
    private String submitterName;

//  letter grade = total marks / possible marks = grade scale
// getter

    public String getLetterGrade() {
        if (((1.0 * earnedMarks / possibleMarks * 100) >= 90)) {
            return "A";
        } else if (((double) earnedMarks / possibleMarks) * 100 >= 80) {
            return "B";
        } else if ((1.0 * earnedMarks / possibleMarks) * 100 >= 70) {
            return "C";
        } else if ((1.0 * earnedMarks / possibleMarks) * 100 >= 60) {
            return "D";
        } else {
            return "F";
        }

    }

// build the constructor == Create getter and setter for earnedMarks
// && only getter for possibleMarks, submitterName, letterGrade

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;

    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }




}







