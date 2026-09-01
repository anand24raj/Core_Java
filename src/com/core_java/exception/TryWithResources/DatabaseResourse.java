package com.core_java.exception.TryWithResources;

public class DatabaseResourse implements AutoCloseable 
{
    @Override
    public void close() throws Exception 
    {
        IO.println("Database Resourse closed successfully");
    }
}