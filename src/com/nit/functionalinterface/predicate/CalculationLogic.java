/* CalculationLogic

Write a Java program that defines a method testPredicate to test a given number against a provided predicate.

Input: Sample Number (18)
Output:
18 is even: true
18 is greater than 10: true
18 is prime: false
Explanation:
class name CalculationLogic(ELC) : Method name : testPredicate 
Access Modifier : public 
Non-Access Modifier : static 
return type : boolean 
parameters : int, 
Predicate<Integer> This method should return a boolean value indicating whether the given number satisfies the provided predicate. 
In the main method: Define three predicates: isEven: Checks if a given number is even. 
isGreaterThanTen: Checks if a given number is greater than 10. 
isPrime: Verify the given number is prime or not. 
Define a sample integer number (e.g., 18). 
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.*/

package com.nit.functionalinterface.predicate;

import java.util.function.Predicate;

public class CalculationLogic {

    public static boolean testPredicate(int num, Predicate<Integer> predicate) 
    {
        return predicate.test(num);
    }

    void main() {

        int number = Integer.parseInt(IO.readln("Enter the Number : "));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        Predicate<Integer> isGreaterThanTen = n -> n > 10;

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // Testing predicates
        IO.println(number + " is even: " + testPredicate(number, isEven));
        IO.println(number + " is greater than 10: " + testPredicate(number, isGreaterThanTen));
        IO.println(number + " is prime: " + testPredicate(number, isPrime));
    }
}

