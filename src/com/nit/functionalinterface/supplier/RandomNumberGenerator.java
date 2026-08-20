/*How to generate a random number :
---------------------------------
There is a predefined class available in java.util package called Random
class, by using Random we can generate random numbers.

It provides a non static method

public int nextInt(int bound)
------------------------------
Based on the given bound It will generate the random number but bound value
will be exclusive.

Example :
Random random = new Random();
int randomNum = random.nextInt(100);  //It will a (single) random number
                                         from 0 to 99


Note : We cannot pass 0 (zero) as a bound value otherwise It will generate
       an exception java.lang.IllegalArgumentException


//Program :
------------  */
package com.nit.functionalinterface.supplier;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        IO.println(randomNum); //0 to 9
    }
}