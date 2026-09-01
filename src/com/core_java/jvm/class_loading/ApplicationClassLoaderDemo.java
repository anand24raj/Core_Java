package com.core_java.jvm.class_loading;


class Test
{
}

public class ApplicationClassLoaderDemo 
{
    void main()
    {

        IO.println("Test.class file is loaded by:");
        IO.println(Test.class.getClassLoader());
    }
}