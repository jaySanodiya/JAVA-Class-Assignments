package com.week4;

import java.util.*;

public class Mapping {
    public static void main(String[] args) {
       /* List randomArr = new ArrayList();
        randomArr.add(1);
        randomArr.add("jay");
        randomArr.add(new Student(10,"raj",87));
        System.out.println(randomArr);
        System.out.println(randomArr.get(1));
        Student i = (Student) randomArr.get(2);
        System.out.println(i); */

        /* Set<Student> students = new TreeSet();

        students.add(new Student(15,"name4",550));
        students.add(new Student(14,"name3",950));
        students.add(new Student(16,"name5",650));
        students.add(new Student(10,"name1",850));
        students.add(new Student(12,"name2",450));

        System.out.println(students);
        for (Student s:students) {
            System.out.println(s.getMark());
        } */


        Map<Student,Integer> map = new TreeMap<>();

        map.put(new Student(14,"name3",950),7);
        map.put(new Student(15,"name4",550),10);
        map.put(new Student(16,"mohan",650),2);
//        System.out.println(map);

       Set<Student> keys = map.keySet();
        for (Student s :keys) {
//            System.out.println(s);
        }
        Collection<Integer> values = map.values();
        for (Integer i:values) {
//            System.out.println(i);
        }
//        System.out.println(values);

        Set<Map.Entry<Student, Integer>> entry = map.entrySet();
        for (Map.Entry<Student,Integer> en :entry) {
            System.out.println(en.getKey()+"  "+en.getValue());
        }
    }
}
