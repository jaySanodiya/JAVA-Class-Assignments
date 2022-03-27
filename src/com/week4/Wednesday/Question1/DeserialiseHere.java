package com.week4.Wednesday.Question1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiseHere {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();

        System.out.println(student.name);
        System.out.println(student.roll);
        System.out.println(student.address.Email);
        System.out.println(student.address.Password);

    }
}
