package com.nit.functionalinterface.predicate;

import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class PredicateDemo3 {
    public static void main(String[] args) {

        // salary > 50K
        Predicate<Employee> p3 = emp -> emp.getSalary() > 50000;

        boolean isValid = p3.test(new Employee(1, "Scott", 60000));
        IO.println("Your salary is greater than 50K : " + isValid);
    }
}
