package com.nit.Array2;

public class OddandEven {
	public static void main(String[] args) {
		int odd = 0;
		int even = 0;

		int arr[] = { 45, 34, 56, 78, 99, 56 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		IO.println("Even No : " + even + "\nOdd No : " + odd);

		IO.print("\nEven Numbers : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				IO.print(arr[i] + " ");
				even++;
			}
		}
		IO.print("\nEven Count : " + even);

		IO.print("\nOdd Numbers : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				IO.print(arr[i] + " ");
				odd++;
			}
		}
		IO.print("\nOdd Count : " + odd);
	}
}
