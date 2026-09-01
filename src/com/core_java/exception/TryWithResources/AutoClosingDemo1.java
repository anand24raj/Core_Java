package com.core_java.exception.TryWithResources;

public class AutoClosingDemo1 
{

    public static void main(String[] args) throws Exception 
    {

        DatabaseResourse dr = new DatabaseResourse();
        FileResourse fr = new FileResourse();

        try (dr; fr) 
        {

            int x = 10 / 0;
            IO.println(x);

        } catch (ArithmeticException e) 
        {

            IO.println("Don't put zero");
        }
    }
}