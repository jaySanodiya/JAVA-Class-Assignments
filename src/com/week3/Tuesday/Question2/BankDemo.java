package com.week3.Tuesday.Question2;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {

        SavingAccount SA = new SavingAccount();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount which you want to deposit");
        double Amount =  sc.nextInt();

        SA.deposit(Amount);

        System.out.println("Enter amount which you want to withdraw");
        double amount =  sc.nextInt();

        try{
            int rupee = (int)SA.withdraw(amount);
            System.out.println("Rupees "+ rupee + " is deposited from your account");
        }
        catch (InsufficientFundException er){
            System.out.println(er.getMessage());
        }

    }
}
