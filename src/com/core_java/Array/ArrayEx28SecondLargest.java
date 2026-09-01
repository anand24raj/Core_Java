package com.core_java.Array;


// WAP to find the second largest number in an array

public class ArrayEx28SecondLargest 
{
    public static void main(String[] args) 
    {

        int[] arr = {3,12, 5, 2, 8, 4, 7, 10,12};

          int max=arr[0]; //3
          for(int i=0;i<arr.length;i++)
          {
              if(max<arr[i])
              {
                  max=arr[i];
              }
          }
          // max=12
          int secMax=0;
          for(int i=0;i<arr.length;i++)
          {
              if(max>arr[i] && secMax<arr[i])
              {
                  secMax=arr[i];
              }
          }
          System.out.println("SecMax ="+secMax);
    }
}