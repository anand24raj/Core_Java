package com.core_java.String_new;

public class UpperCaseToLowercaseAndReverse {

	public static void main(String[] args) 
	{
       String s = "Today Is Sunday";
        char ch[] = s.toCharArray();
        
        String str = "";
        IO.println("Original Sentance  "+ s);
        for (int i = 0; i < ch.length; i++) 
        {
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				str += (char)(ch[i] + 32);
			}
			else
			{
				str += (char)(ch[i] - 32);
			}
		}
        IO.println("After change : " + str);
	}
}
