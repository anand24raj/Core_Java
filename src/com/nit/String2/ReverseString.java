package com.nit.String2;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s = "anand";
	
		IO.print("Reverse of " + s + " are : ");
		for (int i =  s.length() - 1; i >= 0; i--) 
		{
			IO.print(s.charAt(i) + " ");
		}
	}

}
