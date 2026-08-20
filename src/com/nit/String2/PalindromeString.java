package com.nit.String2;

public class PalindromeString {

	public static void main(String[] args) 
	{
		String s = "mdam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			rev += s.charAt(i);
		}
		if(rev.equals(s))
		{
			IO.println( s + " is Palindrome");
		}
		else
		{
			IO.println( s + " is not Palindrome");
		}
		
	}

}
