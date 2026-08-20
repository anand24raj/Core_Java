package com.nit.String2;

import java.util.Arrays;

public class AsendingOrderaftersum
{
    public static void main(String[] args)
    {
        String arr[] = {"Mango", "banana", "apple", "kiwi", "papaya"};

        String result[] = new String[arr.length];

        IO.println("Word Name  ->  Word Sum");
        
        for(int x = 0; x < arr.length; x++)
        {
            int max = Integer.MAX_VALUE;
            int index = -1;

            for(int i = 0; i < arr.length; i++)
            {
                if(!arr[i].equals(""))
                {
                    int sum = 0;

                    for(int j = 0; j < arr[i].length(); j++)
                    {
                        sum += arr[i].charAt(j);
                    }

                    if(sum < max)
                    {
                        max = sum;
                        index = i;
                    }
                }
            }
            System.out.println(arr[index] + " -> " + max);
            result[x] = arr[index];
            arr[index] = "";
        }

        System.out.println("After Sorting (in Asending Order) : " + Arrays.toString(result));
    }
}