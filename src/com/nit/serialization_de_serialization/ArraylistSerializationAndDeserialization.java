package com.nit.serialization_de_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArraylistSerializationAndDeserialization 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
        String filePath = "D:\\new\\Cities.txt";

        ArrayList<String> listOfCities = new ArrayList<>();
        listOfCities.add("Hyderabad");
        listOfCities.add("Pune");
        listOfCities.add("Indore");
        listOfCities.add("Mumbai");

        // Serialization
        var fout = new FileOutputStream(filePath);
        var oos = new ObjectOutputStream(fout);

        try (fout; oos) 
        {
            oos.writeObject(listOfCities);
            IO.println("Data Stored Successfully");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        // De-serialization
        FileInputStream fin = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fin);

        try (fin; ois) 
        {

            @SuppressWarnings("unchecked")
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            IO.println(list);

        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}