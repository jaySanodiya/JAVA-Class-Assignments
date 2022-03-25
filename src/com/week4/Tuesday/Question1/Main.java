package com.week4.Tuesday.Question1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(10 , "Jay" , 1000));
        list.add(new Student(11 , "Sandesh",400));
        list.add(new Student(13 , "Raj" , 880));
        list.add(new Student(16 , "Rahul" , 950));
        list.add(new Student(19 , "Aman" , 60));

        List<Student> stud = list.stream().filter(s-> s.getMarks()<800).toList();
        stud.forEach(s-> System.out.println(s));

    }

}
