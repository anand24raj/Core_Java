package com.core_java.Array_new;

public class FindSmallestElement {

	public static void main(String[] args) {
		int arr[] = { 45, 34, 56, 78, 99, 56 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		IO.println("Smallest Element = " + min);
	}
}
