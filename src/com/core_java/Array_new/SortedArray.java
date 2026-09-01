package com.core_java.Array_new;

public class SortedArray{

	public static void main(String[] args) {
		
		int arr[] = {45, 34, 56, 78, 99};
		
		boolean flag = true;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) 
            {
                flag= false;
                break;
            }
        }
        System.out.println(flag);
	}
}
