package com.techelevator;

public class SavingsAccount extends BankAccount {

    //attribute...




    //constructor...

    public SavingsAccount(String accountNumber, String accountName, int balance) {
        super(accountNumber, accountName, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }



    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            return balance;
        } else {
            balance = balance - amountToWithdraw;
            return balance;
        }

    }



}





