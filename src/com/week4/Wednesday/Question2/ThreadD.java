package com.week4.Wednesday.Question2;

public class ThreadD implements Runnable{
    CommonFunction cf;
    String name;

    public ThreadD(CommonFunction cf, String name) {
        this.cf = cf;
        this.name = name;
    }

    @Override
    public void run() {
        cf.function2(name);

    }
}
