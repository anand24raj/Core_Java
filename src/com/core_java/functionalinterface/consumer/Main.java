/*Write a Java program to demonstrate Consumer<T> using lambda expressions in multiple Consumer 
 operations are applied on the same input

Input:
Enter a word: java
Output:
Original Value : java
Length         : 4
Uppercase      : JAVA*/

package com.core_java.functionalinterface.consumer;

import java.util.function.Consumer;

public class Main 
{
    public static void main(String[] args) 
    {
         String str =  IO.readln();

         Consumer<String> c1 = s -> IO.println("Original Value : " + s);
         c1.accept(str);
         
         Consumer<String> c2 = s -> IO.println("Length         : " + s.length());
         c2.accept(str);
         
         Consumer<String> c3 = s -> IO.println("Uppercase      : " + s.toUpperCase());
         c3.accept(str);

     }
}

