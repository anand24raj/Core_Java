package com.core_java.blc;

public class Employee1 {

    int employeeId;
    String employeeName;
    double employeeSalary;

    public void setEmployeeData(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        employeeSalary = salary;
    }

    public void getEmployeeData() {
        IO.println("Employee id is: " + employeeId);
        IO.println("Employee Name is: " + employeeName);
        IO.println("Employee Salary is: " + employeeSalary);
    }
}

