package com.core_java.String_new;

public class EachWordDuplicate 
{
	public static void main(String[] args) 
	{
		String[] str = { "mango", "papaya", "banana", "papaya" };
		
		for (String string : str) 
		{
			System.out.println(Duplicate(string));
		}
	}
	
	public static String Duplicate(String str) {

	    String result = "";

	    for (int i = 0; i < str.length(); i++) {

	        char ch = str.charAt(i);
	        boolean found = false;

	        for (int j = 0; j < result.length(); j++) 
	        {
	            if (result.charAt(j) == ch) {
	                found = true;
	                break;
	            }
	        }

	        if (!found) 
	        {
	            result += ch;
	        }
	    }

	    return result;
	}
}	