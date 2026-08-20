package com.nit.InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamDemo 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        String filePath = "D:\\new\\Hyderabad.txt";

        FileInputStream fin = new FileInputStream(filePath);

        try (fin) 
        {
            while (true) 
            {
                int i = fin.read();

                if (i == -1) 
                {
                    break;
                }

                IO.print((char) i);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}