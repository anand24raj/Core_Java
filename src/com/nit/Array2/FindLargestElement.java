package com.nit.Array2;

public class FindLargestElement {

	public static void main(String[] args) {
		int arr[] = { 45, 34, 56, 78, 99, 56 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max)
				max = arr[i];
		}
		IO.println("Largest Number = " + max);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		IO.println("2nd Mehods of Largest Number = " + arr[arr.length - 1]);
	}
}
