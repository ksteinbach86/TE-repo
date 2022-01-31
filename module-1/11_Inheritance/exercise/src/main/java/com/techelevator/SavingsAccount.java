package com.techelevator;

public class SavingsAccount extends BankAccount {

    //attribute...

    private double serviceCharge;


    //constructor...

    public SavingsAccount(String accountNumber, String accountName, double serviceCharge) {
        super(accountNumber, accountName);
    }

    public void addServiceCharge() {
       if (getBalance() > 150.00) {
           double serviceCharge = getBalance() + 2.00
       }




    }




}
