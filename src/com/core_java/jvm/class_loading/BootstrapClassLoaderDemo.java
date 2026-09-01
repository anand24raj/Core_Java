package com.core_java.jvm.class_loading;

class Demo 
{
}

public class BootstrapClassLoaderDemo 
{
	void main()
	{
    
        // Bootstrap ClassLoader
        IO.println(String.class.getClassLoader());

        // Parent of Platform ClassLoader (Bootstrap)
        IO.println(
            Demo.class.getClassLoader().getParent().getParent()
        );
    }
}