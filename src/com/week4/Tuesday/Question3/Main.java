package com.week4.Tuesday.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(10 , "Jay" , 600));
        list.add(new Student(11 , "Sandesh",400));
        list.add(new Student(13 , "Raj" , 580));
        list.add(new Student(16 , "Rahul" , 70));
        list.add(new Student(19 , "Aman" , 60));


        Stream<Student> std = list.stream();
/*
        List<Employee> employees = new ArrayList<>();

        std.forEach(student -> {
            employees.add(new Employee(student.getRoll(),student.getName(),student.getMarks()*1000));

        });

        for (Employee showEmployeeDetails:employees) {
            System.out.println(showEmployeeDetails);
        }*/

        List<Employee> emp = std.map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks() * 1000)).toList();

        emp.forEach(System.out::println);

    }
}
