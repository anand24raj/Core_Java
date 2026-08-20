package com.nit.Array2;

public class PalindromeElement 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 121, 1634 };

//		int size = Integer.parseInt(IO.readln("Enter array size : "));
//
//		int arr[] = new int[size];
//
//		for(int i = 0; i < size; i++)
//		{
//		    arr[i] = Integer.parseInt(IO.readln(i + " index Enter element : "));
//		}
		
		
		IO.print("Palindrome Numbers : ");
		for (int i = 0; i < arr.length; i++) 
		{
			int num = arr[i]; // 121
			int rev = 0;
			while (num != 0) // 1>0
			{
				int lastDigit = num % 10; // ld=1
				rev *= 10 + lastDigit; // 121
				num /= 10;
			}
			if (num == rev) {
				IO.print(arr[i] + " ");
			}
		}
	}
}



/*		IO.print("Palindrome Numbers : ");
		for (int i = 0; i < arr.length; i++) 
		{
			int temp = arr[i]; // 121
			int rev = 0;
			while (temp > 0) // 1>0
			{
				int lastDigit = temp % 10; // ld=1
				rev = rev * 10 + lastDigit; // 121
				temp /= 10;
			}
			if (rev == arr[i]) 
			{
				IO.print(arr[i] + " ");
			}
 */

