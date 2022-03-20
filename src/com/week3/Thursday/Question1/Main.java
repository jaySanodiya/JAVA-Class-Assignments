package com.week3.Thursday.Question1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        TreeSet<Product> emp =null;


        System.out.println("Enter Sorting criteria 1 for price, 2 for name and 3 for Id wise");
        int choice = sc.nextInt();

        if(choice==1){
            emp = new TreeSet<>(new productPrice());
        }
        else if(choice==2){
            emp = new TreeSet<>(new productName());
        }
        else{
            emp = new TreeSet<>(new productId());
        }


       System.out.println("Enter Product Details");
        System.out.println("==============================");
        int count =1;
        while(count<5){
            System.out.println("Product 0"+count);
            System.out.println("Enter Product Id");
            int id = sc.nextInt();

            System.out.println("Enter Product name");
            String name = sc.next();

            System.out.println("Enter Price of Product");
            double price = sc.nextInt();


            emp.add(new Product(id,name,price));

            count++;
        }


        System.out.println(emp);


    }
}
