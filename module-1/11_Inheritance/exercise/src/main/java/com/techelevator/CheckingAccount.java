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
        if (amountToWithdraw > getBalance()) {
            return getBalance();
        } else {
            super.withdraw(amountToWithdraw);
            return getBalance();
        }

    }







}
