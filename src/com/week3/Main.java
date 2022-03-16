package com.week3;


import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String args[]) {
        LocalDate cDate = LocalDate.now();

        LocalDate dob = LocalDate.of(1998,4,9);

        Period diff = Period.between(dob,cDate);
        System.out.println(diff);
        System.out.println(diff.getDays());

    }
}
