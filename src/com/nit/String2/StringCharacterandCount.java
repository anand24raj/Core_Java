package com.nit.String2;

public class StringCharacterandCount
{
	public static void main(String[] args) 
	{
		String s = "anand";
		IO.print("Character of " + s + " are : ");
		for (int i = 0; i < s.length(); i++) 
		{
			IO.print(s.charAt(i) + " ");
		}
		IO.print("\nCount of Anand are : " + s.length());
		
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			count++;
		}
		IO.print("\nCount of Anand are  using count : " + count);

	}

}
