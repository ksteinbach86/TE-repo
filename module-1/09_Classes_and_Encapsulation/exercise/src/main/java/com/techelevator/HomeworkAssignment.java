package com.techelevator;

public class HomeworkAssignment {

// int variables
    private int earnedMarks;
    private int totalMarks;
    private int possibleMarks;
    private String submitterName;

//  letter grade = total marks / possible marks = grade scale
// getter

    public String getLetterGrade() {
        if (((1.0 * totalMarks / possibleMarks) * 100) >= 90) {
            return "A";
        } else if (((double) totalMarks / possibleMarks) * 100 >= 80) {
            return "B";
        } else if ((1.0 * totalMarks / possibleMarks) * 100 >= 70) {
            return "C";
        } else if ((1.0 * totalMarks / possibleMarks) * 100 >= 60) {
            return "D";
        } else {
            return "F";
        }

    }

// build the constructor == Create getter and setter for earnedMarks
// && only getter for possibleMarks, submitterName, letterGrade

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.earnedMarks = earnedMarks;
    }

    public int getearnedMarks() {
        return earnedMarks;
    }

    public int setearnedMarks(int earnedMarks) {
        return earnedMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }




}







