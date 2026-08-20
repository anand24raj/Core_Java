package com.nit.Array2;

public class PrimeNumber {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

		IO.print("Prime Numbers : ");

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			boolean prime = true;

			if (num <= 1) 
			{
				prime = false;
			}

			for (int j = 2; j * j <= num; j++) {
				if (num % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime) 
			{
				IO.print(num + " ");
			}
		}
		
//		int n = 8;
//		int count = 0;
//
//		for(int i = 1; i <= n; i++)
//		{
//		    if(n % i == 0)
//		    {
//		        count++;
//		    }
//		}
//
//		if(count == 2)
//		{
//		    IO.println("Prime");
//		}
//		else
//		{
//			IO.println("Not Prime");
//		}
	}

}
