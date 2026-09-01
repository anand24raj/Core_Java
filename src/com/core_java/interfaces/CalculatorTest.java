/*Design a Caluculator Program

Define an interface Calculator :
create one abstract method 

Methods :

name : calculateSum ()
Return Type :void
Arguments Type :varargs type
Access Modifier :public

Take one normal class SimpleCalculator which implements Calculator interface

in this class just implement the overriden method calculateSum and write the specific logic in this method.

Create a Main class named as CalculatorTest nad instantiate the object and call the method for execution.

#	Status	Input	Expected						Output
1	FAILED	3		Sum of the numbers: 6			
			1
			2
			3
					
2	FAILED	4		Sum of the numbers: 100			
			10
			20
			30
			40
			
			*/

package com.core_java.interfaces;

interface Calculator {
    // Abstract method with varargs
    void calculateSum(int... numbers);
}

class SimpleCalculator implements Calculator {
    public void calculateSum(int... numbers) {
        int sum = 0;
        for (int n : numbers)
            sum += n;
        IO.println("Sum of the numbers: " + sum);
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        int count = Integer.parseInt(IO.readln());  // First input: number of integers
        
        int[] numbers = new int[count];             // Array to store numbers
        
        // Read each number
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(IO.readln());
        }
        
        // Create calculator and calculate sum
        SimpleCalculator calc = new SimpleCalculator();
        calc.calculateSum(numbers);
    }
}
