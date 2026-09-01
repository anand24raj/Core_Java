package com.core_java.objectclass.FinalKeyword;

class B   
{
    final int A = 10;

    public void setData() 
    {  
    	// A= 10; Error
       IO.println(A);
    }
}

public class FinalVarEx 
{
    public static void main(String[] args) 
    {
        B a1 = new B();
        a1.setData();
    }
}
