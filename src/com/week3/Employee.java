package com.week3;

public class Employee implements Comparable<Employee> {
    public int empId;
    public String name;
    public int salary;

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

    public int getSalary() {
        return salary;
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
