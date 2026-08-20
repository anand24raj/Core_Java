/* Write a program in java to find the second smallest element in an array.

Test Data :
Input the size of array : 5

Input 5 elements in the array (value must be <9999) :
element - 0 : 0
element - 1 : 9
element - 2 : 4
element - 3 : 6
element - 4 : 5

Expected Output :
The Second smallest element in the array is : 4

Note: Write a logic to find the second smallest element inside a method and also return the second smallest element

Method name:-findSecondSmallest
Argument Type:-1d int array type
Return type:- int

Take the input from the user inside the main method and also call the method from the main only
 and get the result back and print the output through main only.*/

package com.nit.Array.TwoDimensional;

public class FindSecondSmallest 
{
    // Method to find second smallest element
    public static int findSecondSmallest(int[] arr) 
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {

            if (arr[i] < smallest) 
            {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) 
            {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) 
    {
        int size = Integer.parseInt(IO.readln("Enter the size : ").trim());

        int[] array = new int[size];

        for (int i = 0; i < size; i++) 
        {
            array[i] = Integer.parseInt(IO.readln("Enter the elements : ").trim());
        }

        int result = findSecondSmallest(array);

        IO.println("The Second smallest element in the array is : " + result);
    }
}
