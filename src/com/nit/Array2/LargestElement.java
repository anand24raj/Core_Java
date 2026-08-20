package com.nit.Array2;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 20, 50, 10, 70, 90 };

		System.out.println(findLargest(arr));
	}

	public static int findLargest(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
