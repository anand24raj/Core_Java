package com.nit.Array;

public class Array {
	public static void main(String[] args) {
		int sum = 0;
		// Array is a collection of homogeneous element.
		// it start with 0 index
		// end with length -1 // 5-1 =4
		// [ 10 20 30 40 50 ] -> 5
		// [ 0 1 2 3 4 ] // index value

		int size = Integer.parseInt(IO.readln("Enter the size of the array ..."));

		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = Integer.parseInt(IO.readln("Enter Number :"));
		}
		for (int i = 0; i < size; i++) {
			sum += a[i];
		}
		System.out.print("Sum = " + sum);
	}
}
