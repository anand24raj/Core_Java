/*Q5) Insert a new element in the array at last position.*/

package com.nit.Array.PrimitiveType;

import java.util.Arrays;

//Insert a new element in the array at last position

class InsertAtLast 
{
 public static int[] insertAtLast(int[] arr, int element) 
 {
     int[] newArray = new int[arr.length + 1];

     for (int i = 0; i < arr.length; i++) 
     {
         newArray[i] = arr[i];
     }

     newArray[newArray.length - 1] = element;

     return newArray;
 }
}

public class InsertLastPosition 
{
 public static void main(String[] args) 
 {
     int val[] = {10, 20, 30, 40};

     IO.println("Original Array : " + Arrays.toString(val));

     int[] insertAtLast = InsertAtLast.insertAtLast(val, 50);

     IO.println("After insertion : " + Arrays.toString(insertAtLast));
 }
}