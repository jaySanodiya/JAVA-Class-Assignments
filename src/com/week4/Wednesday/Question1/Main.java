package com.week4.Wednesday.Question1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Address address = new Address("jay.sanodiya09@gmail.com","helloWorld");
        Student student = new Student(3886,"Jay Sanodiya",address);

        FileOutputStream fos = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);
        oos.flush();
        oos.close();

        System.out.println(student.name);
        System.out.println(student.roll);
        System.out.println(student.address.Email);
        System.out.println(student.address.Password);

    }
}
