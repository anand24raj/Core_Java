package com.nit.String2;

class CharacterOccurance {
    public static void main(String[] args) {

        String str = "banana";

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '*') 
            {
                continue;
            }

            System.out.print(ch[i] + " occurs at index ");

            for (int j = i; j < ch.length; j++) {

                if (ch[i] == ch[j]) {

                    System.out.print(j + " ");

                    if (j != i) 
                    {
                        ch[j] = '*';
                    }
                }
            }

            System.out.println();
        }
    }
}