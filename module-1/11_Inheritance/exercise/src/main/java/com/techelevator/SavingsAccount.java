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
        if (amountToWithdraw > getBalance()) {
            return getBalance();
        } else {
            super.withdraw(amountToWithdraw);
            return getBalance();
        }




}





