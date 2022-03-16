package com.week3.Wednesday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter your joining date");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        try{
           EmployeeBonus bonus = new EmployeeBonus();
           double price = bonus.BonusIs(date);
            System.out.println(price);

        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
