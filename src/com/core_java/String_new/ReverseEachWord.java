//package com.nit.String2;
//
//public class ReverseEachWord {
//
//	public static void main(String[] args) 
//	{
//		String s = "I Love Java";
//		//          0  1    2
//
//        String arr[] = s.split(" ");
//        
//        for(int i = 0; i < arr.length; i++)
//        {
//            String word = arr[i];
//            //         4-1
//            for(int j = word.length() - 1; j >= 0; j--)
//            {
//                IO.print(word.charAt(j)); // I evol avaJ
//            }
//            IO.print(" ");
//        }
//	}
//}


package com.core_java.String_new;

public class ReverseEachWord {

    public static void main(String[] args) {
        String[] str = {"mango", "papaya", "banana", "papaya"};

        for (String word : str) {
            System.out.println(reverse(word));
        }
    }

    public static String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }
}
