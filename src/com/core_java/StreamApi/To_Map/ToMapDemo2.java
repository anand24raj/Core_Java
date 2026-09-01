package com.core_java.StreamApi.To_Map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapDemo2 
{
    public static void main(String[] args) 
    {
        List<String> listOfCountry =
                List.of("India", "Australia", "USA", "China", "Japan");

        Map<String, Integer> map = listOfCountry
                .stream()
                .collect(Collectors.toMap(
                        String::toUpperCase,
                        String::length));

        IO.println(map);
    }
}