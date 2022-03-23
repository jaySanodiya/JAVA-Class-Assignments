package com.week4;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public int roll;
    public String name;
    public int mark;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && mark == student.mark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, mark);
    }

    public Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student O) {
        return (mark > O.getMark()) ? +1:-1;
    }
}
