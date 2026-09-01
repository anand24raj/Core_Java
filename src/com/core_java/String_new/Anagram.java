package com.core_java.String_new;

public class Anagram {
	public static void main(String[] args) {
		
//		 String s = "listen";
//		 String s1 = "silent";
//		  
//		  if (s.length() != s1.length()) { 
//			  IO.println("Not Anagram.."); 
//			  return; 
//			  }
//		  
//		  boolean flag = true;
//		  
//		  for (int i = 0; i < s.length(); i++) { 
//			  char ch = s.charAt(i);
//		  
//		  int count = 0; 
//		  int count1 = 0;
//		  
//		  for (int j = 0; j < s.length(); j++) {
//			  if (ch == s.charAt(j)) { 
//				  count++; 
//				  } 
//			  }
//		  
//		  for (int j = 0; j < s1.length(); j++) { 
//			  if (ch == s1.charAt(j)) {
//				  count1++; 
//				  }
//		  } 
//		  if (count != count1) { 
//			  flag = false; 
//			  break; 
//			  } 
//		  }
//		  
//		  if (flag) {
//			  IO.println(s + " and " + s1 + " both are Same so, Anagram.."); 
//			  }
//		  else
//		  { 
//			  IO.println(s + " " + s1 + " both are Different so, Not Anagram.."); 
//			  }
		 

		String s1 = "silent";
		String s2 = "listen";

		boolean flag = true;

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (ch1 == ch2) {
			flag = false;
		} else {
			for (int i = 0; i < ch1.length; i++) {
				boolean found = false;

				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]) {
						found = true;
						ch2[j] = '*'; // Mark as used
						break;
					}
				}
				if (!found) {
					flag = false;
					break;
				}
			}
		}
		System.out.println("Is Anagram : " + flag);
	}
}
