package com.week3.Thursday.Question2;

public class Employee implements Comparable<Employee> {
    public int empId;
    public String name;
    public double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee employee){
        if(this.salary> employee.salary)
            return 1;
        else if(this.salary<employee.salary)
            return -1;
        else
            return name.compareTo(employee.name);

    }
}
