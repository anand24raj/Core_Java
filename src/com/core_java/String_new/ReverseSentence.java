package com.core_java.String_new;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "I Love Java";
		
		for (int i = s.length() - 1 ; i >= 0 ; i--) 
		{
			IO.print(s.charAt(i));
		}
	}

}
