package com.week3.Tuesday.Question2;

public class SavingAccount {

    int accountNumber = 491007982;
    double balance;

    public void deposit(double  amount){
        balance = amount;
    }

      public double withdraw(double amount) throws InsufficientFundException{


            if(amount>balance){
                InsufficientFundException IF = new InsufficientFundException("Insufficient Amount in the Account");
                throw IF;
            }

        return amount;
    }
}
