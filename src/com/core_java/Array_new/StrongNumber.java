package com.core_java.Array_new;

public class StrongNumber {

	public static void main(String[] args) {
		int arr[] = { 145, 123, 2, 40585, 10 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i]; //0 index
			int temp = num;   //145                                                         2
			int sum = 0;

			while (temp > 0) { //temp - 145      14     1      0 (false ) loop end		   2				0 loop close 

				int digit = temp % 10; // 5       4     1								   2

				int fact = 1; // factorial start

				for (int j = 1; j <= digit; j++) {
					fact = fact * j; // 5 -> 24 * 5 = 120   4 -> 24   1 -> 1					2
				}

				sum = sum + fact;   // 0 + 120  +   24   +   1   ==> 145						0 +2= 2
				temp = temp / 10;    //  145/10  =   14/10   =   1/10 == 0                    2/10 = 0
			}

			if (sum == num) {     // 145 == 145  -> true                                    2 == 2 true
				System.out.println(num + " is Strong Number");
			}
		}
	}

}
