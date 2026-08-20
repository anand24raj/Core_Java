package com.nit.blc;

public class Employee2 {

    int employeeNumber;
    String employeeName;
    double employeeSalary;
    char employeeGrade;

    public void setEmployeeData(int id, String name, double salary) {
        employeeNumber = id;
        employeeName = name;
        employeeSalary = salary;
    }

    public void calculateEmployeeGrade() {
        if (employeeSalary > 100000) {
            employeeGrade = 'A';
        } else if (employeeSalary > 75000) {
            employeeGrade = 'B';
        } else if (employeeSalary > 50000) {
            employeeGrade = 'C';
        } else {
            employeeGrade = 'D';
        }
    }

    public void getEmployeeData() {
        IO.println("Employee Number is: " + employeeNumber);
        IO.println("Employee Name is: " + employeeName);
        IO.println("Employee Salary is: " + employeeSalary);
        IO.println("Employee Grade is: " + employeeGrade);
    }
}

