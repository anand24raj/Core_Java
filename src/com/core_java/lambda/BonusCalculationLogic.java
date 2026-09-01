/*A company wants to calculate an employee’s bonus amount based on their salary and performance rating.
To ensure the calculation logic is defined using exactly one abstract method, the interface must be annotated with @FunctionalInterface.

The bonus calculation logic should be implemented using a lambda expression.

Rules
Create an interface BonusCalculator
Annotate it with @FunctionalInterface
Declare only one abstract method:
double calculateBonus(double salary, int rating);

Bonus Calculation Logic:
Rating ≥ 4 → 20% of salary
Rating = 3 → 10% of salary
Rating < 3 → No bonus
Implement the interface using a lambda expression
Display the calculated bonus amount

Input Format
Salary
Performance Rating

Output Format
Display the bonus amount*/


package com.core_java.lambda;

import java.util.Scanner;

@FunctionalInterface
interface BonusCalculator 
{
    double calculateBonus(double salary, int rating);
}

public class BonusCalculationLogic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        IO.print("Enter Monthly Salary : ");
        double salary = sc.nextDouble();
        IO.print("Enter Rating(0 - 5) : ");
        int rating = sc.nextInt();

        BonusCalculator calculator = (sal, rate) -> 
        {
            if (rating >= 4) 
            {
                return salary * 0.20;
            } 
            else if (rating == 3) {
                return salary * 0.10;
            } 
            else 
            {
                return 0.0;
            }
        };

        double bonus = calculator.calculateBonus(salary, rating);
        IO.println("Bonus Amount = " + bonus);
        sc.close();
    }
}