package com.nit.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayEx05TotalMarks 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        try (sc) 
        {

            System.out.print("How Many Subjects: ");
            int noOfSubject = Integer.parseInt(sc.nextLine());

            int[] marks = new int[noOfSubject];

            //Initialize the array variable
            
            for (int i = 0; i < marks.length; i++) 
            {
                System.out.print("Enter Marks: ");
                marks[i] = Integer.parseInt(sc.nextLine());
            }

            //Adding the marks of the student
            
            int total = 0;
            for (int x : marks)
                total += x;

            System.out.println("The total Marks is :" + total);

            double average = (double) total / noOfSubject;
            System.out.println("Average is :" + average);

        } 
        catch (NegativeArraySizeException e) 
        {
            System.err.println("Array size must be positive integer");
        } 
        catch (InputMismatchException e) 
        {
            e.printStackTrace();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}