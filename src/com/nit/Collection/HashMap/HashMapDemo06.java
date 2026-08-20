package com.nit.Collection.HashMap;

import java.util.HashMap;

public class HashMapDemo06
{
    public static void main(String[] args)
    {
        String text = "java is fun java is powerful java is great";

        String[] words = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        IO.println(wordCount);
    }
}