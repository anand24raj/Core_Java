package com.nit.String2;

public class CountWord {
	public static void main(String[] args) {
		String s = " Java is a Programming Language. ";

		
	
		//Count of Word using space
		
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') 
			{
				count++;
			}
		}
		IO.println("Count of Word using space : " + count);

		// Count of Word using split(); 
		
		String arr[] = s.split(" ");

		int counts = arr.length;

		IO.println("Count of Word using split : " + counts);

	}
}
