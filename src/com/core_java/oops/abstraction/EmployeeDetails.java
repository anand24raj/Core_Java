/*A company wants to calculate salaries for different types of employees.

There are two types of employees: PermanentEmployee and ContractEmployee.

Both types have different salary calculation methods, but the basic structure is common.

An abstract class Employee defines the template method calculateSalary() that must be implemented by subclasses.

This ensures all employee types follow a common structure, but the actual calculation differs.

Abstract Class Employee

Cannot be instantiated directly.

Contains common attribute: name.

Contains abstract method: calculateSalary() — forces subclasses to implement their own calculation.

Contains concrete method: displayInfo() — shared by all employees.

PermanentEmployee

Implements calculateSalary() as basicPay + allowance.

ContractEmployee

Implements calculateSalary() as hourlyRate × hoursWorked.

Main Class

Creates objects only through subclasses, because abstract class cannot be instantiated.

Calls displayInfo() to print name and salary.
Examples
Output

Task executed successfully.*/

package com.core_java.oops.abstraction;

abstract class Employee 
{
    protected String name;

    public Employee(String name) 
    {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayInfo() 
    {
        IO.println("Employee Details:");
        IO.println("Employee Name: " + name);
        IO.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee 
{

    private double basicPay;
    private double allowance;

    public PermanentEmployee(String name, double basicPay, double allowance) 
    {
        super(name);
        this.basicPay = basicPay;
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() 
    {
        return basicPay + allowance;
    }
}

class ContractEmployee extends Employee 
{

    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, double hourlyRate, int hoursWorked) 
    {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class EmployeeDetails {
    void main() 
    {
        int x = Integer.parseInt(IO.readln());
        switch(x)
        {
            case 1-> 
            {
            String name = IO.readln();
            double basicPay = Double.parseDouble(IO.readln());
            double allowance = Double.parseDouble(IO.readln()); 

            Employee E = new PermanentEmployee(name, basicPay, allowance);
            E.displayInfo();
            }
            case 2-> 
            {
            String name = IO.readln();
            double hourlyRate = Double.parseDouble(IO.readln());
            int hoursWorked = Integer.parseInt(IO.readln()); 

            Employee E = new ContractEmployee(name, hourlyRate,hoursWorked);
            E.displayInfo();
            }
            default ->
            {
                IO.println("Invalid choice!");
            }
        }
    }
}

