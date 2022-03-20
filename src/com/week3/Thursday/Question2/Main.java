package com.week3.Thursday.Question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Employee> emp =new TreeSet<>();


        System.out.println("Enter Employee Details");
        System.out.println("==============================");
        int count =1;
        while(count<5){
            System.out.println("Employee 0"+count);
            System.out.println("Enter Employee Id");
            int id = sc.nextInt();

            System.out.println("Enter Employee name");
            String name = sc.next();

            System.out.println("Enter Salary of Employee");
            double price = sc.nextInt();


            emp.add(new Employee(id,name,price));

            count++;
        }


        for (Employee employee : emp) {
            System.out.println(employee);
        }


    }
}
