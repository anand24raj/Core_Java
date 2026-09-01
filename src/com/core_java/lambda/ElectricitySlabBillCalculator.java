/*Electricity Slab Bill Calculator

An electricity department calculates the monthly bill based on the number of units consumed.
To ensure that the billing logic is defined using exactly one abstract method, 
the interface must be annotated with @FunctionalInterface.

The slab calculation logic should be implemented using a lambda expression.

Rules
Create an interface ElectricityBillCalculator
Annotate it with @FunctionalInterface
Declare only one abstract method:
double calculateBill(int units);

Billing Logic:
Units ≤ 100 → ₹2 per unit
Units > 100 and ≤ 300
First 100 → ₹2/unit
Remaining → ₹3/unit
Units > 300
First 100 → ₹2/unit
Next 200 → ₹3/unit
Remaining → ₹5/unit
Implement the interface using a lambda expression
Display the total bill amount

Input Format
---------------------
Units Consumed
Output Format
-----------------------
Display the total electricity bill amount.*/

package com.core_java.lambda;

import java.util.Scanner;

@FunctionalInterface
interface ElectricityBillCalculator 
{
    double calculateBill(int units);
}

public class ElectricitySlabBillCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter Units : ");
        int units = sc.nextInt();

        ElectricityBillCalculator billCalculator = unit -> 
        {
            if (unit <= 100) 
            {
                return unit * 2.0;
            } 
            else if (unit <= 300) 
            {
                return (100 * 2.0) + ((unit - 100) * 3.0);
            } 
            else 
            {
                return (100 * 2.0) + (200 * 3.0) + ((unit - 300) * 9.0);
            }
        };

        double totalBill = billCalculator.calculateBill(units);

        System.out.println("Total Bill = " + totalBill);
        sc.close();
    }
}