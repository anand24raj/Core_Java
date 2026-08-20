package com.nit.String2;

public class CompareTwoStringsWithoutUsingequals {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";

		boolean flag = true;

		if (s1.length() != s2.length()) 
		{
			flag = false;
		} 
		else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					flag = false;
					break;
				}
			}
			IO.println("Using Without any method : " + flag);
		}

		
		
		 System.out.println("Using HashMap : " + (s1.hashCode() == s2.hashCode()));
		 
		 
		  int res = s1.compareTo(s2); //0
		  
		  if(res==0) System.out.println("Using Compareto method : equal");
		  
		  else System.out.println("Using Compareto method : Not equal");
	}

}
