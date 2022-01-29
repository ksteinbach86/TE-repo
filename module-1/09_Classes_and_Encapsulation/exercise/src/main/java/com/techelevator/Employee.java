package com.techelevator;

public class Employee {

    // variables == first name, last name, monthly sal

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;


    //constructor


    public Employee(int empId, String fName, String lName, double annualSalary) {

        firstName = fName;
        lastName = lName;
        employeeId = empId;
        this.annualSalary = annualSalary;


    }


    // methods == set and get last name && department, get int employee id, string first name, string full name,
    // double annual salary


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }


//method to raise salary by 5.5%??????


    public void raiseSalary(double percent) {
        double percentAsDecimal = percent / 100;
        double increaseInSalary = annualSalary * percentAsDecimal;
        annualSalary = increaseInSalary + annualSalary;

    }


}
