package com.core_java.Array;

import java.util.Arrays;

class ChangeArrayElement 
{
    public static int[] modifyArrayElement(int[] array) 
    {
        array[0] = 100;
        array[1] = 200;
        return array;
    }
}

public class ArrayEx08ChangeArrayElement
{
    public static void main(String[] args) 
    {

        int[] arr = {1000, 2000, 3000, 4000, 5000};

        IO.println("Original Array :");
        IO.println(Arrays.toString(arr)); // [1000, 2000, 3000, 4000, 5000]
        
        // calling the method to modify array elements

        int[] modifiedArray = ChangeArrayElement.modifyArrayElement(arr);

        IO.println("Array after modification :");
        IO.println(Arrays.toString(modifiedArray)); // [100, 200, 3000, 4000, 5000]

        IO.println("Original Array after method call :");
        IO.println(Arrays.toString(arr)); // [100, 200, 3000, 4000, 5000]
    }
}