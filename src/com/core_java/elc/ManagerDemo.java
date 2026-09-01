package com.core_java.elc;

import com.core_java.blc.Manager;

public class ManagerDemo {
	void main()
	{
		Manager scott  =new Manager();
		scott.setManagerData (101, "Mr Scott", 80000);
		IO.println(scott); //calling toString() internally
		
		IO.println("---------------------------------------------------------------------");
		
		Manager swati = new Manager();
		swati.setManagerData(102, "Miss Swati", 90000);
		IO.println(swati); //calling toString() internally
	}
}