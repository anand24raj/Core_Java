package com.nit.StreamApi.To_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

record Trainer(Integer id, String name, Double salary) {}

public class ToMapDemo4 
{
    public static void main(String[] args) 
    {
        ArrayList<Trainer> listOfTrainers = new ArrayList<>();

        listOfTrainers.add(new Trainer(111, "Scott", 322000D));
        listOfTrainers.add(new Trainer(222, "Smith", 350000D));
        listOfTrainers.add(new Trainer(333, "Alen", 367000D));
        listOfTrainers.add(new Trainer(444, "John", 349000D));
        listOfTrainers.add(new Trainer(111, "Ravi", 350000D)); // duplicate

        Map<Integer, String> collect = listOfTrainers
                .stream()
                .collect(Collectors.toMap(Trainer::id,Trainer::name,
                        (_, newValue) -> newValue,LinkedHashMap::new )); // maintain insertion order

        collect.forEach((k, v) -> IO.println(k + " : " + v));
    }
}