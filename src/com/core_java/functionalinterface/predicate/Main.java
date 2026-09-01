/*Write a Java program to check voting eligibility of a person using the
Predicate<Integer> functional interface.
Create a Person class to store person details and a separate Main class to test voting eligibility.
Print all person details along with voting status.

Input:
Enter Name: Rahul
Enter Age: 22
Enter Gender: Male
Output:
--- Person Details ---
Name   : Rahul
Age    : 22
Gender : Male
Voting Status: Eligible to Vote*/

package com.core_java.functionalinterface.predicate;

import java.util.function.Predicate;

public class Main 
{
     void main() 
     {
         String name =  IO.readln();
         int age =  Integer.parseInt(IO.readln());
         String gender =  IO.readln();

         Person person = new Person(name, age, gender);

         Predicate<Integer> isEligibleToVote = a -> a >= 18;
         boolean result = Person.testPredicate(age, isEligibleToVote);
         person.displayDetails(result);
     }
}

class Person 
{
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

     public static boolean testPredicate(int number, Predicate<Integer> predicate) 
     {
        return predicate.test(number);
     }
     public void displayDetails(boolean isEligible) 
     {
    	 IO.println("--- Person Details ---");
         IO.println("Name   : " + name);
         IO.println("Age    : " + age);
         IO.println("Gender : " + gender);
         IO.print("Voting Status: ");
         
        if (isEligible) 
        {
             IO.println("Eligible to Vote");
        } 
        else 
        {
             IO.println("Not Eligible to Vote");
        }
    }
}
