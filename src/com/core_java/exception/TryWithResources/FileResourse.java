package com.core_java.exception.TryWithResources;

import java.io.Closeable;
import java.io.IOException;

public class FileResourse implements Closeable 
{

    @Override
    public void close() throws IOException 
    {
        IO.println("File Resourse closed successfully");
    }
}