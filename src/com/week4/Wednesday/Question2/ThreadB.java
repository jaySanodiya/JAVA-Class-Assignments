package com.week4.Wednesday.Question2;

public class ThreadB implements Runnable{
    CommonFunction cf;
    String name;

    public ThreadB(CommonFunction cf, String name) {
        this.cf = cf;
        this.name = name;
    }

    @Override
    public void run() {
        cf.function1(name);

    }
}
