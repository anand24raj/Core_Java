package com.nit.serialization_de_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializationDemo 
{
    public static void main(String[] args) throws IOException 
    {
        String filePath = "D:\\new\\Employee.txt";

        var fout = new FileOutputStream(filePath);
        var oos = new ObjectOutputStream(fout);

        try (fout; oos) 
        {
            int no = Integer.parseInt(IO.readln("How many objects ?"));

            for (int i = 1; i <= no; i++) 
            {
                int id = Integer.parseInt(IO.readln("Enter id :"));
                String name = IO.readln("Enter Name :");
                double salary = Double.parseDouble(IO.readln("Enter Salary :"));
                Employee employee = Employee.getEmployeeObject(id, name, salary, LocalDate.now());
                oos.writeObject(employee);
            }

            IO.println("Object Data stored Successfully");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}