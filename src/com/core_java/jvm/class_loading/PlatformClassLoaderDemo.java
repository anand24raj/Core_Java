package com.core_java.jvm.class_loading;

class Sample 
{
}

public class PlatformClassLoaderDemo
{
    void main() 
    {

        IO.println("Super class of Application ClassLoader is:");
        IO.println(Sample.class.getClassLoader().getParent());
    }
}