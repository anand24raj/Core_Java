package com.core_java.functionalinterface.function;

import java.util.function.Function;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class FunctionDemo4 {
    public static void main(String[] args) {

        Function<Employee, String> fnName = emp -> emp.getName();
        Function<Employee, Double> fnSalary = emp -> emp.getSalary();

        Employee e1 = new Employee(111, "Raj", 80000);

        IO.println(fnName.apply(e1) + " salary is :" + fnSalary.apply(e1));
    }
}
