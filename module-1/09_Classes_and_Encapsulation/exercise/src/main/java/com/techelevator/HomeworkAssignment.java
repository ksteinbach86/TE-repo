package com.techelevator;

public class HomeworkAssignment {

// int variables

    private int totalMarks;
    private int possibleMarks;
    private String submitterName;

//  letter grade = total marks / possible marks


// getter

    public String getLetterGrade() {
        for(((1.0 * totalMarks / possibleMarks) * 100) >= 90) {
        return "A";
    } else if (((double)totalMarks / possibleMarks) * 100 >= 80) {
        return "B";
        } else if((1.0 * totalMarks / possibleMarks) * 100 >= 70) {
            return "C";
        } else if ((1.0 * totalMarks / possibleMarks) * 100 >= 60) {
            return "D";
        } else {
            return "F";
        }


return possibleMarks;



}
