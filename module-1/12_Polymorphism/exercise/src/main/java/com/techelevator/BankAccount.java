package com.techelevator;

public class BankAccount implements Accountable  {

    private String accountHolderName;
    private String accountNumber;
    private int balance;


// constructors

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;

    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


   // getters

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    //methods ...

    public int transferTo(BankAccount destinationAccount, int transferAmount) {
        this.balance -= transferAmount;
        destinationAccount.deposit(transferAmount);
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }






}
