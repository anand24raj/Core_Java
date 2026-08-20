package com.nit.String2;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "I Love Java";
		String str="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) != ' ')
			{
				str += s.charAt(i);
			}
		}
	IO.println(str);
	}

}
