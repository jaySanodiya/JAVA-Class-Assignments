package com.week4;

@FunctionalInterface
interface Intr{
    void sayHello(String name);
}
class X implements Intr{
    public void sayHello(String name){
        System.out.println("Welcome "+name);
    }
    public static void main(String[] args) {
        Intr i1 = new X();
        i1.sayHello("Admin");
    }
}
