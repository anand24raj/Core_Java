package com.nit.Multithreading.ITC;

public class ITCDemo1 
{
    public static void main(String[] args) 
    {
	    	try 
	    {
	    		IO.println("Main Thread started!!!");
	        Object obj = new Object();
	            //  Illegal: wait() without synchronized
	        obj.wait();
	        } 
	    	catch (InterruptedException e) 
	    	{
	    		
	    }
    }
}