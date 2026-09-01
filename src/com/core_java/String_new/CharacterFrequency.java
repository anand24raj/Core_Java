package com.core_java.String_new;

public class CharacterFrequency
{
    public static void main(String[] args)
    {
        String s = "banana";

        char ch[] = s.toCharArray();

        System.out.println("Character Frequency of " + s + " :");

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == '*')
            {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                    ch[j] = '*';
                }
            }
            System.out.println(ch[i] + " -> " + count);
        }
    }
}




//package com.nit.String2;
//
//public class CharacterFrequencyOrOccurance {
//	public static void main(String[] args)
//    {
//        // Original String
//        String s = "Anand";
//
//        // Convert String into character array
//        char ch[] = s.toCharArray();
//
//        // Display heading
//        IO.println("Character Frequency of " + s + " : ");
//
//        // Outer loop picks one character at a time
//        for(int i = 0; i < ch.length; i++)  //A
//        {
//            // Skip if character is already counted
//            if(ch[i] == '*')   // if a found they skip
//            {
//                continue;
//            }
//
//            // Assume frequency is 1
//            int count = 1;
//
//            // Convert current character to lowercase manually
//            char current = ch[i]; //a
//
//            if(current >= 'A' && current <= 'Z')
//            {
//                current = (char)(current + 32);
//            }
//
//            // Compare with remaining characters
//            for(int j = i + 1; j < ch.length; j++)  //n
//            {
//                // Take comparison character
//                char next = ch[j];   //n
//
//                // Convert to lowercase manually
//                if(next >= 'A' && next <= 'Z')
//                {
//                    next = (char)(next + 32);
//                }
//
//                // If same character found
//                if(current == next)   
//                {
//                    count++;
//
//                    // Mark duplicate character
//                    ch[j] = '*';
//                }
//            }
//
//            // Print only unmarked characters
//            if(ch[i] != '*')
//            {
//                IO.println(current + " -> " + count);
//            }
//        }
//     }
//}




/*
 * package com.nit.String2;
 * 
 * public class CharacterFrequency { public static void main(String[] args) {
 * String s = "Anand";
 * 
 * char ch[] = s.toCharArray();
 * 
 * IO.println("Character Frequency of " + s + " : ");
 * 
 * for(int i = 0; i < ch.length; i++) //A { if(ch[i] == '*') { continue; }
 * 
 * int count = 1;
 * 
 * char current = ch[i];
 * 
 * if(current >= 'A' && current <= 'Z') { current = (char)(current + 32); }
 * 
 * for(int j = i + 1; j < ch.length; j++) { char next = ch[j];
 * 
 * if(next >= 'A' && next <= 'Z') { next = (char)(next + 32); }
 * 
 * if(current == next) { count++;
 * 
 * ch[j] = '*'; } }
 * 
 * if(ch[i] != '*') { IO.println(current + " -> " + count); } } } }
 */
