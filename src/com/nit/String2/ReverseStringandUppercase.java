/*package com.nit.String2;

public class ReverseStringandUppercase {

	public static void main(String[] args)
	{
		String s = "anand";
		//   A -> 65  // a
		//       + 32    
		//  a -> A  97 -32=65
		IO.print("Reverse of " + s + " are : ");
		
		for (int i =  s.length() - 1; i >= 0; i--) 
		{
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				IO.print(Character.toLowerCase(ch) + " ");
			}
			else
			{
				IO.print(Character.toUpperCase(ch) + " ");
			}
		}
	}

}

*/
package com.nit.String2;

public class ReverseStringandUppercase {

	public static void main(String[] args) {
//		String And UpperCase & Lowercase

		String s = "i lOVE jAVA";
		char ch[] = s.toCharArray();

		String result = "";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if (ch[i] >= 'A' && ch[i] < 'Z') 
			{
				result += (char) (ch[i] + 32) + "";
			} else 
			{
				result += (char) (ch[i] - 32) + "";
			}
		}
		System.out.println(result);

//		Reverse String And UpperCase & Lowercase

//		String s = "Anand";
//		//   A -> 65  // a
//		//       + 32    
//		//  a -> A  97 -32=65
//		IO.print("Reverse of " + s + " are : ");
//		for (int i =  s.length() - 1; i >= 0; i--) 
//		{
//			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
//			{
//				IO.print(((s.charAt(i) + 32)) + " ");
//			}
//			else
//			{
//				IO.print(((char)(s.charAt(i) - 32)) + " ");
//			}
//		}
	}

}
