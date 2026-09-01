package com.core_java.String_new;

public class StringLength {

	public static void main(String[] args) {
		String str = "anand raj";
		int  count = 0;
		
		for(int i = 0; i < str.length(); i++) 
		{
			count++;
		}
		IO.println("Length of the string = " + count);
	}
}