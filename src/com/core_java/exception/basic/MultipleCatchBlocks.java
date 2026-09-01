package com.core_java.exception.basic;

public class MultipleCatchBlocks
{
    public static void main(String[] args) 
    {
        IO.println("Main Started...");

        try 
        {
            int c = 10 / 5;
            IO.println("c value is :" + c);

            int[] x = {12, 78, 56};
            IO.println(x[4]);
        } 
        catch (ArrayIndexOutOfBoundsException e1) 
        {
            System.err.println("Array is out of limit...");
        } 
        catch (ArithmeticException e1) 
        {
            System.err.println("Divide By zero problem...");
        } 
        catch (Exception e1) 
        {
            IO.println("General Exception");
        }

        IO.println("Main Ended...");
    }
}