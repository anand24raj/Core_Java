package com.nit.serialization_de_serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        String filePath = "D:\\new\\Employee.txt";

        var fin = new FileInputStream(filePath);
        var ois = new ObjectInputStream(fin);

        try (fin; ois) 
        {
            while (true) 
            {
                Employee emp = (Employee) ois.readObject();
                IO.println(emp);
            }

        } 
        catch (EOFException e) 
        {
            System.err.println("End of file has reached " + e);
        }
    }
}