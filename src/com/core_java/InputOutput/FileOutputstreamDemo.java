package com.core_java.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputstreamDemo 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fout = new FileOutputStream("D:\\new\\Hyderabad.txt");

        try (fout) 
        {
            String data = "A city famous for IT & Biryani";
            byte[] bytes = data.getBytes();

            fout.write(bytes);
            IO.println("Data stored successfully");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}