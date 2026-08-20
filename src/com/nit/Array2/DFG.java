package com.nit.Array2;

public class DFG
{
	public static void main(String[] args) {
		
		String str = "i Love hyderabad";
		
		String arr[] = str.split(" ");
		
		for(int i = 0; i < arr.length; i++)
		{
		String word = arr[i];
			
			for(int j = word.length() - 1; j >= 0; j--)
			{
				IO.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}
	 
}
