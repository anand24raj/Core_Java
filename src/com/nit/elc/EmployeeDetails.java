package com.nit.elc;

import com.nit.blc.Employee;
//ELC (EmployeeDetails.java)
public class EmployeeDetails{
	void main()
	{
		var id= Integer.parseInt(IO.readln("Enter Employee Id: "));
		var name = IO.readln("Enter Employee Name:");
		var salary = Double.parseDouble (IO.readln("Enter Employee Salary :"));
		
		String employeeData = Employee.getEmployeeDetails(id, name, salary);
		
		IO.println("Employee Details :");
		IO.println(employeeData);
	}
}

