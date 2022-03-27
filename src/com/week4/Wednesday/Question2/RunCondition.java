package com.week4.Wednesday.Question2;

public class RunCondition {
    public static void main(String[] args) {
        CommonFunction commonFunction = new CommonFunction();

        ThreadA tA = new ThreadA(commonFunction,"jay");
        Thread t1 = new Thread(tA);

        ThreadB tB = new ThreadB(commonFunction,"anushree");
        Thread t2 = new Thread(tB);

        t1.start(); //this is a race condition as these both thread working on CommonFunction at the same time so there can be a conflict while providing data.
        t2.start();

        // to over come this problem we have to make function1 synchronized;
        // so I'm makeing another function function2 which is synchronized;

        ThreadC tC = new ThreadC(commonFunction,"jay");
        Thread t3 = new Thread(tC);

        ThreadD tD = new ThreadD(commonFunction,"anushree");
        Thread t4 = new Thread(tD);
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------Synchronized function----------");
        t3.start();
        t4.start();
    }
}
