package com.nit.String2;

public class LargestWord {

	public static void main(String[] args) {

		String s = "i am readyy to learn java programming";
		String[] words = s.split(" ");

		String first = "";
		String second = "";
		String third = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > first.length()) 
			{
				third = second;
				second = first;
				first = words[i];
			} 
			else if (words[i].length() > second.length()) 
			{
				third = second;
				second = words[i];
			} else if (words[i].length() > third.length()) 
			{
				third = words[i];
			}
		}

		IO.println("Largest Word = " + first);
		IO.println("Second Largest Word = " + second);
		IO.println("Third Largest Word = " + third);
	}
}
