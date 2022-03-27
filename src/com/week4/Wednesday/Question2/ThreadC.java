package com.week4.Wednesday.Question2;

public class ThreadC implements Runnable{
    CommonFunction cf;
    String name;

    public ThreadC(CommonFunction cf, String name) {
        this.cf = cf;
        this.name = name;
    }

    @Override
    public void run() {
        cf.function2(name);

    }
}
