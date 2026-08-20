package com.nit.exception.basic;

public class MultipleCatchBlocks2 
{
    public static void main(String[] args) 
    {
        IO.println("Main method started!!!");

        try 
        {
            String str1 = null;
            IO.println(str1.toUpperCase()); // NullPointerException

            String str2 = "Ravi";
            int x = Integer.parseInt(str2);
            IO.println("Number is :" + x);

        } 
        catch (NumberFormatException | NullPointerException e) 
        {

            if (e instanceof NumberFormatException) 
            {
                System.err.println("Number is not in a proper format");
            } 
            else if (e instanceof NullPointerException) 
            {
                System.err.println("ref variable is pointing to null");
            }
        }

        IO.println("Main method ended!!");
    }
}