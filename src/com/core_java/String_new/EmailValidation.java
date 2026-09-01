package com.core_java.String_new;

public class EmailValidation {

	public static void main(String[] args) {
		
		String email="johngmail.com";
		
		String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		
		 if (email.matches(regex)) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	}

}
