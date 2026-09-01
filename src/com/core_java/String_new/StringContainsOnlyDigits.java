package com.core_java.String_new;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {

		String s = "a3b5d8f9";
		
		//String[] str = { "abc", "123", "456", "efg" };

		int count = 0;
		int sum = 0;

		IO.print("No of Elements : ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
				sum += (int) (s.charAt(i) - 48);
				IO.print(s.charAt(i) + " ");
			}
		}
		IO.println("\nSum of elements : " + sum);
		IO.println("No of counts : " + count);

	}

}
