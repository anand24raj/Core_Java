package com.nit.Array2;

import java.util.Arrays;

public class ExistNoOrLinearSearch 
{

    public static void main(String[] args) {

        int arr[] = {45, 34, 56, 78, 99, 56};
        int key = 56;
        int index = -1;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) 
            {
                System.out.println("The No " + key +
                        " inside these No " + Arrays.toString(arr) +
                        " Found at index : " + i);
                found = true;
                index = i;
                break;
            }
        }

        if (!found) {
            System.out.println("The No " + key +
                    " inside these No " + Arrays.toString(arr) +
                    " not Found at any index, so index = " + index);
        }
    }
}