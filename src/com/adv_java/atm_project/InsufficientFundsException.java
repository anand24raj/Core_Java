package com.adv_java.atm_project;


//InsufficientFundsException.java
class InsufficientFundsException extends Exception 
{
 /**
     * 
     */
    private static final long serialVersionUID = 1L;

 InsufficientFundsException() 
 {
     super();
 }

 InsufficientFundsException(String msg) 
 {
     super(msg);
 }
}