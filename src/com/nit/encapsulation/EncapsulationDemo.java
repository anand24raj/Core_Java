package com.nit.encapsulation;

public class EncapsulationDemo {

    void main() {

        // Read employee data
        var id = Integer.parseInt(IO.readln("Enter the employee id: "));
        var name = IO.readln("Enter the employee name: ");
        var salary = Double.parseDouble(IO.readln("Enter the employee salary: "));

        // Create Employee object
        Employee scott = new Employee(id, name, salary);

        // Print employee details
        IO.println("\nEmployee Details:");
        IO.println(scott);

        // Read increment
        var increment = Double.parseDouble(IO.readln("\nEnter the increment amount: "));

        // Update salary
        scott.setSalary(scott.getSalary() + increment);

        // Print updated details
        IO.println("\nUpdated Employee Details:");
        IO.println(scott);

    }
}
