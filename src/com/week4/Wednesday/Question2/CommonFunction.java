package com.week4.Wednesday.Question2;

public class CommonFunction {
    void function1(String s1){
        System.out.println("Welcome");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(s1);
    }

    void function2(String s1){
        synchronized (this){
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(s1);
        }

    }
}
