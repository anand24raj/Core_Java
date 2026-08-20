package com.nit.String2;

public class RemoveDuplicatechar {
	public static void main(String[] args) {
		String[] str = { "mango", "papaya", "banana", "papaya" };

		for(String s: str) 
		{
			System.out.println(removeDuplicate(s));
		}

	}
	
	public static String removeDuplicate(String str)  // papaya
	{ 
		String result = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
		}
		
		return result;
	}

}     



//package com.nit.String2;
//
//public class RemoveDuplicatechar
//{
//	public static void main(String[] args) 
//	{
//		String[] str = { "mango", "papaya", "banana", "papaya" };
//		
//		for (String string : str) 
//		{
//			System.out.println(Duplicate(string));
//		}
//	}
//	
//	public static String Duplicate(String str) {
//
//	    String result = "";
//
//	    for (int i = 0; i < str.length(); i++) {
//
//	        char ch = str.charAt(i);
//	        boolean found = false;
//
//	        for (int j = 0; j < result.length(); j++) 
//	        {
//	            if (result.charAt(j) == ch) {
//	                found = true;
//	                break;
//	            }
//	        }
//
//	        if (!found) 
//	        {
//	            result += ch;
//	        }
//	    }
//
//	    return result;
//	}
//}	
