package com.core_java.oops.encapsulation;

public class Employee {

    // Private fields (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter for id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < this.salary) {
            System.err.println("Error: Increment amount cannot be negative OR zero");
            System.exit(0);
        }
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
