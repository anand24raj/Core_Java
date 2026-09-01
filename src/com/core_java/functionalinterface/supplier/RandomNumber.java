/*Write a Java program to generate a random number between 1 and 1000 using the
java.util.function.Supplier<Integer> interface and the java.util.Random class.

Input:
-
Output:
Generated Random Number: 457*/

package com.core_java.functionalinterface.supplier;

import java.util.Random;

public class RandomNumber
{
	void main()
    {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        IO.println(randomNum); 
    }

}