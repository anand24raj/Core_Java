package com.core_java.Array;

public class ArrayEx29LargestNumber
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 5, 2, 8, 4, 7, 10};

         // max -> bara -> while writing condition -> small

           int max=arr[0]; // max=9
         for(int i=0;i<arr.length;i++) //0<7
         {
            if(max<arr[i]) // 9<10
            {
                
                max=arr[i]; //  max=10 
            }
         }
         System.out.println(max);

    }
}