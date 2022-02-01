package com.techelevator;

public class CheckingAccount extends BankAccount {

    // attribute...
    private int transactionAmount;



    // constructor...

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }



    //The Override Method ...

    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            return balance;
        } else {
            balance = balance - amountToWithdraw;
            return balance;
        }

    }







}
