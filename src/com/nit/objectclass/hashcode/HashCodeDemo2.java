package com.nit.objectclass.hashcode;

public class HashCodeDemo2
{
	public static void main (String[] args)
	{
		String s1 = "Java";
		String s2 = new String("Java");
		
		IO.println(s1==s2);
		
		IO.println(s1.hashCode());
		IO.println(s2.hashCode());
	}
	
}

