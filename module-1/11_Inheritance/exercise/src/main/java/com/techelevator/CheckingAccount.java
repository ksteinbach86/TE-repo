package com.techelevator;

public class CheckingAccount extends BankAccount {

    // attribute...
    private int transactionAmount;
    private static final int NUM_FREE = 3;
    private static final double TRANS_FEE = 10.00;

    // constructor...

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
        transactionAmount = 0;
    }


    //The Override Method ...


    @Override
    public boolean deposit(int transactionAmount) {
        if (super.deposit(transactionAmount)) {
            transactionAmount++;
            return true;
        }

        return false;
    }

    public boolean withdraw(int transactionAmount) {
        if (super.withdraw(transactionAmount)) {
            transactionAmount++;
            return true;
        }

        return false;

    }


    // fees
    
    public void withdrawFees() {
        if ((transactionAmount < NUM_FREE) && (transactionAmount > -100.00)) {
            double TRANS_FEE = TRANS_FEE * (transactionAmount - NUM_FREE);
            if (super.withdraw((int) TRANS_FEE)) {
                transactionAmount = 0;
            }
        }
    }




}
