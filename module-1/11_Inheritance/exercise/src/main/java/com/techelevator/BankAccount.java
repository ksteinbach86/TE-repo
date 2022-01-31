package com.techelevator;

public class BankAccount {

    // attributes...

    private String accountHolderName;
    private String accountNumber;
    private int balance;
    private int amount;
    private boolean withdraw;


    // constructor...

    public BankAccount(String accountHolderName, String accountNumber) {
        balance = 0;

    }


    //getters and setters...

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    //Method...

    public int deposit() {
        return balance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(int amount) {
//        boolean result;
//        this.amount = amount;
        if (amount > balance) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }

    }

        return 0;


}

















