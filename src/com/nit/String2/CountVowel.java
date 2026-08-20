package com.nit.String2;

public class CountVowel 
{
//	public static void main(String[] args) 
//	{
//		String s = "Anand";
//		
//		int vowel = 0;
//		int consonant = 0;
//		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			char ch = s.charAt(i);
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' ||
//					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U')
//			{
//				vowel++;
//			}
//			else if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' ||ch != 'u' ||
//					ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' ||ch != 'U')
//			{
//				consonant++;
//			}
//		}
//		IO.println("Count of Vowel in " + s + " are : "  + vowel);
//
//		IO.print("Count of Consonant in " + s + " are : "  + consonant);
//	}
	
	
	
	public static void main(String[] args) 
    {
        String str = "Java Programming";

        char ch[] = str.toCharArray();
        
        int vowel = 0;
        int cont = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' ||ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            {
                vowel++;
            }
            else if(ch[i] != 'a' || ch[i] != 'e' ||ch[i] != 'i' || ch[i] != 'o' || ch[i] != 'u' || ch[i] != 'A' || ch[i] != 'E' || ch[i] != 'I' || ch[i] != 'O' || ch[i] != 'U')
            {
                cont++;
            }
        }
            System.out.println("Vowel count = " + vowel);
            System.out.println("Consonant count = " + cont);

    }
}
