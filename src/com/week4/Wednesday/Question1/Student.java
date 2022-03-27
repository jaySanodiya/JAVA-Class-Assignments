package com.week4.Wednesday.Question1;

import java.io.Serializable;

public class Student implements Serializable {
    int roll;
    String name;
    Address address;

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }
}
