package com.adv_java.jdbc;

/* 
Develop a program to run a function from Java application
	for reading all values of a given employee from DB table.

Step #1: Login to hknit4pm7 schema

Step #2: Create employee table

	CREATE TABLE employee( 
		eno		NUMBER(5) PRIMARY KEY, 
		ename	VARCHAR2(20),
		sal		NUMBER(12,2),
		dept	VARCHAR2(10)
	);

Step #3: Insert few records
	
	INSERT INTO employee VALUES(1, 'Hari', 99999, 'JAVA');
	INSERT INTO employee VALUES(2, 'Balayya', 99999, 'DOTNET');
	INSERT INTO employee VALUES(3, 'Mahesh', 989898, 'Oracle');
	commit;

Step #5:	Compile below function 
				for retrieving employee details from DB

	CREATE or REPLACE FUNCTION 
		getEmpDetails(
			empnum		IN	NUMBER, 
			empname		OUT	VARCHAR2,
			empsal		OUT	NUMBER
		 )
		return VARCHAR2 
	IS 
		empDept employee.dept%TYPE;
	
	BEGIN
		SELECT ename, sal, dept	
			 INTO empname, empsal, empdept
		FROM	employee
		WHERE	 eno = empnum;

		return empDept;
	END;
	/

Step #6: Run below application 
				for executing above function
*/
//Test21_Cstmt_RunFunction.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;

public class Test22_Cstmt_RunFunction {
    public static void main(String[] args) throws Exception {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connection is created");

	// Creating CallableStatement
	CallableStatement cstmt = con.prepareCall("{ ? = call getEmpDetails(?, ?, ?) }");

	// registering out parameters
	cstmt.registerOutParameter(1, Types.VARCHAR);
	cstmt.registerOutParameter(3, Types.VARCHAR);
	cstmt.registerOutParameter(4, Types.DOUBLE);

	// reading eno
	int eno = Integer.parseInt(IO.readln("Enter eno: "));

	// setting eno to cstmt object IN parameter
	cstmt.setInt(2, eno);

	// executing function
	cstmt.execute();

	// reading results from OUT prameters
	String ename = cstmt.getString(3);
	String sal = cstmt.getString(4);
	String dept = cstmt.getString(1);

	// printing result
	IO.println("eno= " + eno + " employee details");
	IO.println("   ename: " + ename);
	IO.println("     sal: " + sal);
	IO.println("    dept: " + dept);

	// closing cstmt & con objects
	cstmt.close();
	con.close();
	IO.println("Resource closed");
    }
}