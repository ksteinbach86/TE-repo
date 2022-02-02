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
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;


    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

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

    public int deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            return balance;
        } else {
            return balance;
        }
    }

    public int withdraw(int amountToWithdraw) {
        if (amount > balance) {
            return balance;
        } else {
            balance = balance - amount;
            return balance;
        }

    }




}

















