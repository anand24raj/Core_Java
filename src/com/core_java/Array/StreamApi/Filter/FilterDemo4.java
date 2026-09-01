package com.core_java.Array.StreamApi.Filter;

import java.util.Arrays;

//Q4) WAP to print all the names whose length is greater than 3, remove the duplicates and sort in reverse order from string array
public class FilterDemo4 {

 public static void main(String[] args) {

     String[] names = {"Scott", "Raj", "Riya", "Smith", "stream","Scott", "Raj", "Riya", "Smith", "Stream"};

     Arrays.stream(names)
             .distinct()
             .sorted((s1, s2) -> s2.compareTo(s1))
             .filter(name -> name.length() > 3)
             .forEach(IO::println);
 }
}