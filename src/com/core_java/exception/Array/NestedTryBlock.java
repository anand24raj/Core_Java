package com.core_java.exception.Array;

import java.util.Arrays;

public class NestedTryBlock 
{
    public static void main(String[] args) 
    {
        try 
        {
            Object[] arr = new String[3];

            arr[0] = "Java";
            arr[1] = "Technology";
            arr[2] = "Adv Java";

            IO.println(Arrays.toString(arr));

            try 
            {
                int[] array = new int[-9];
            } 
            catch (NegativeArraySizeException e) 
            {
                IO.println("Array size must be a positive integer");
            }

        } 
        catch (ArrayStoreException e) 
        {
            IO.println("Cannot insert Illegal data in the Array");
        }
    }
}