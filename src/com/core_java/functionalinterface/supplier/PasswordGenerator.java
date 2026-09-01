/*Assignment - 3
--------------
Create a Java program using the Supplier interface to generate random passwords. The password should be 8 characters long.

Contain a mix of uppercase letters, lowercase letters, digits, and special characters (e.g., @, #, $, !).

Coding  Requirements:
Create a PasswordGenerator class.

Inside the main method :

Define character sets [For password generation as shown below]

 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String lower = "abcdefghijklmnopqrstuvwxyz";
 String digits = "0123456789";
 String special = "@#$%!&*";

Combine all the character set into a single String

Define a Supplier<String> named passwordSupplier which will generate and return a Random Password (Using all character set) by using java.util.Random class.

Use this supplier to generate and print a random secure password.

Output :

Generated Password: Ab3#eT9!*/

package com.core_java.functionalinterface.supplier;

import java.util.Random;

import java.util.function.Supplier;

public class PasswordGenerator
{
    void main()
    {
         String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //26
         String lower = "abcdefghijklmnopqrstuvwxyz"; //26
         String digits = "0123456789";                //10
         String special = "@#$%!&*";                  //7      -> 69

       
         String totalCharacters = upper + lower + digits + special;
         
        // IO.println("Total Characters :"+totalCharacters.length()); //69
         
         Random random = new Random();
         
         Supplier<String> pwdGenerator = () ->
         {
             String password = "";
             for(int i=1; i<=8; i++)
             {            
               int randomNumber = random.nextInt(totalCharacters.length()); //0 - 68
               char randomChar = totalCharacters.charAt(randomNumber);
               password = password + randomChar;
             }
               
             return password;            
         };
         
         String randomPassword = pwdGenerator.get();
         
         IO.println(randomPassword);        
    }
}