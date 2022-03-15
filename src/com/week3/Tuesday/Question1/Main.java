package com.week3.Tuesday.Question1;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        System.out.println("start of main..");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");

        try{
            int num1 = 0;
            try{
                num1 = sc.nextInt();
            }
            catch (Exception er){
                System.out.println("Please enter valid number");
            }

            System.out.println("Enter num2");
            int  num2 = sc.nextInt();

            try {
                if(num2==0){
                    ArithmeticException Ae = new ArithmeticException("");
                    throw Ae;
                }

            }catch (Exception er){
                System.out.println("num2 should not be 0");

            }

            String message = null;
            int num3 = num1 / num2;

            try{
                if (num3 > 10) {
                    message = "Welcome to Exception Handling ";
                    System.out.println("Message is :" + message.toUpperCase());
                }
                else {
                    Exception ex = new Exception("");
                    throw ex;
                }
            }
            catch (Exception er){

                System.out.println("String value is null");

            }
        }
        catch (Exception error){
            error.getMessage();
        }

        System.out.println("end of main");
    }
}
