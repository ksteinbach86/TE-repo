package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public Accountable[] getAccounts() {
        Accountable[] acc = new Accountable[accounts.size()];

            for (int i = 0; i < acc.length; i++) {
                acc[i] = accounts.get(i);
            }
            return acc;
        }
        public boolean isVip () {
            int accountTotal = 0;
            for (int i =0; i < accounts.size(); i++) {
                accountTotal = accountTotal + accounts.get(i).getBalance();
            }
            if (accountTotal >= 25000) {
                return true;
            }
                return false;
            }



        public int getBalance () {
            return 0;
        }


        //getters and setters...

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getAddress () {
            return address;
        }

        public void setAddress (String address){
            this.address = address;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

    }


