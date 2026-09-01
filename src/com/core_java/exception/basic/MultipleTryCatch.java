package com.core_java.exception.basic;

public class MultipleTryCatch 
{
    public static void main(String[] args) 
    {
        IO.println("Main method started");

        try 
        {
            int[] arr = {10, 20, 30};
            IO.println("Element at 3rd index is :" + arr[3]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.err.println("Index of the array is out of bound");
        }

        try 
        {
            String str = "Java";
            Integer val = Integer.valueOf(str);
            IO.println(val);
        } 
        catch (NumberFormatException e) 
        {
            System.err.println("Number is not in a proper format");
        }

        IO.println("Main method ended");
    }
}