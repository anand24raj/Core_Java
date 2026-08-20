/*Smart Loan Repayment Stress Analyzer

financial advisory system evaluates a customer’s loan repayment stress level based on income, EMI, and existing obligations.
To strictly enforce the concept of functional programming, the evaluation logic must be written using an interface annotated with @FunctionalInterface and implemented via a single lambda expression.

The system must calculate the repayment ratio and classify the customer’s financial stress.

Rules
Create an interface StressEvaluator
Annotate it with @FunctionalInterface
Declare only one abstract method:
String evaluate(double monthlyIncome, double totalEMI);
Business Logic (inside lambda):
Calculate repayment ratio:
ratio = totalEMI / monthlyIncome
Stress Classification:
ratio ≤ 0.30 → "Low Stress"
ratio > 0.30 and ≤ 0.50 → "Moderate Stress"
ratio > 0.50 → "High Stress"

Additional Rule:
If totalEMI is greater than monthlyIncome
→ Override result and print "Critical Financial Stress"

Implement all logic inside a single lambda expression
Display the final stress status

Input Format
Monthly Income
Total EMI

Output Format
Display the financial stress status*/


package com.nit.lambda;

import java.util.Scanner;

@FunctionalInterface
interface StressEvaluator 
{
    String evaluate(double monthlyIncome, double totalEMI);
}

public class SmartLoanRepaymentStressAnalyzer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        IO.print("Enter Monthly Income : ");
        double monthlyIncome = sc.nextDouble();
        IO.print("Enter Total EMI : ");
        double totalEMI = sc.nextDouble();

        StressEvaluator evaluator = (income, emi) -> 
        {
            if (emi > income) 
            {
                return "Critical Financial Stress";
            }

            double ratio = emi / income;

            if (ratio <= 0.30) 
            {
                return "Low Stress";
            } 
            else if (ratio <= 0.50) 
            {
                return "Moderate Stress";
            } 
            else 
            {
                return "High Stress";
            }
        };

        String result = evaluator.evaluate(monthlyIncome, totalEMI);
        IO.println(result);
        sc.close();
    }
}
