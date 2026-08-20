package com.nit.Array;

import java.util.*;

//Find the maximum element in the array

class FindMax 
{
    public static void maxValue(int[] arr) 
    {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
        	 if (max < arr[i])
             {
                 max = arr[i];
             }
        }

        System.out.println("Maximum element in the array is :" + max);
    }
}

public class ArrayEx07Max 
{
    public static void main(String[] args) 
    {

        int[] val = null;
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("How Many Values you want: ");
            int n = sc.nextInt();

            val = new int[n];
            
          //Initialize the array variable

            for (int i = 0; i < n; i++) 
            {
                System.out.print("Enter Value of array at " + i + " position: ");
                val[i] = sc.nextInt();
            }

            FindMax.maxValue(val);
        } 
        catch (InputMismatchException e) 
        {
            System.err.println("Input is not in a proper format");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        sc.close();
    }
}