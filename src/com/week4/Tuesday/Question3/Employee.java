package com.week4.Tuesday.Question3;

public class Employee implements Comparable<Employee> {
    public int empId;
    public String empName;
    public int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
            return empName.compareTo(employee.empName);

    }
}
