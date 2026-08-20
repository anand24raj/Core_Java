package com.nit.Collection.MoreEx;

import java.io.FileReader;
import java.util.Properties;

public class PropertyDemo
{
    public static void main(String[] args) throws Exception
    {
        FileReader reader = new FileReader("D:\\new\\db.properties");

        Properties p = new Properties();
        p.load(reader);

        String driver = p.getProperty("driver");
        String userName = p.getProperty("user");
        String password = p.getProperty("password");

        IO.println(driver);
        IO.println(userName);
        IO.println(password);
    }
}