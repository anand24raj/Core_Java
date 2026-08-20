package com.adv_java.jdbc;

/*CallableStatement
===================
	1. The CallableStatement is a Statement object
	2. It is a Sub interface of PreparedStatement 
	3. It is used for executing stored procedures in a database
	   Stored procedures means procedures, functions and cursors stored in the DB server
	4. It allows calling the stored procedures with IN, OUT, and INOUT parameters.
	
	5. In addition to the methods inherited from Statement and PreparedStatement interfaces
	   the CallableStatement interface provides below new methods
	   
	   	1. method for registering OUT parameter
	   	 	public void registerOutParameter(int parameterIndex, int sqlType)
						- for setting sqlType value, we must use Types class
						
		2. methods for setting values to IN parameters
		 	public void setXxx(int paramterIndex, xxx value) //inherited from PStmt
		 	
		3. methods for getting values to OUT parameters
		 	public xxx getXxx(int paramterIndex)
		 	
		4. For running procedure we will use 
			the no-param execute() method inherited from the PreparedStatement 	
						
	6. The CallableStatement object is created by using 
		the Connection.prepareCall() method.
		
	7. The syntax for calling Procedure with IN and OUT parameters
			{call <procedureName>(?, ?, ?, ...)}
		
	   The syntax for calling function with IN and OUT parameters
			{? = call <functionName>(?, ?, ?, ...)}
		  //this ? must be OUT parameter 
	
Program 20: 
========================================================================
   Develop a program to run a procedure from Java application
   for incrementing sal of a given employee with given sal.
   Later read & display this employee's updated sal.
========================================================================
Step #1: Login to hknit11ap9 schema

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

Step #4: Compile below procedure in oracle DB

	CREATE or REPLACE PROCEDURE 
		updateEmpSal(
			empnum		IN		NUMBER, 
			incrSal		IN		NUMBER, 
			empname		OUT		VARCHAR2,
			empsal		OUT		NUMBER,
			empdept		OUT		VARCHAR2
		)
	IS
		oldSal employee.sal%TYPE;
		
	BEGIN

		SELECT	sal INTO oldSal 
		FROM	employee 
		WHERE	eno = empnum;

		UPDATE	employee
		SET		sal = oldSal + incrSal
		WHERE	eno = empnum;

		COMMIT;

		SELECT	ename, sal, dept	
		INTO	empname, empsal, empdept
		FROM	employee
		WHERE	eno = empnum;

	END;
	/

Step #5: Run below application to execute above procedure*/

//Test20_Cstmt_RunProcedure.java

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Types; //for setting DB type to OUT parameters
import java.sql.SQLException;

public class Test21_Cstmt_RunProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connected user: " + con.getMetaData().getUserName());

	// 3. Creating CallableStatement
	CallableStatement cstmt = con.prepareCall("{call updateEmpSal(?, ?, ?, ?, ?) }");

	// 4. Registering OUT parameters type
	cstmt.registerOutParameter(3, Types.VARCHAR);
	cstmt.registerOutParameter(4, Types.DOUBLE);
	cstmt.registerOutParameter(5, Types.VARCHAR);

	// 5. Reading eno & incrSal from console from keyboard

	int eno = Integer.parseInt(IO.readln("Enter eno: "));
	double incrSal = Double.parseDouble(IO.readln("Enter sal increment by: "));

	// 6. setting eno & incrSal to IN parameters in cstmt object
	cstmt.setInt(1, eno);
	cstmt.setDouble(2, incrSal);

	// 7. executing procedure and populating values into OUT parameters
	cstmt.execute();

	// 8. reading OUT parameters values from CallableStatement object
	String ename = cstmt.getString(3);
	double sal = cstmt.getDouble(4);
	String dept = cstmt.getString(5);

	// 9. printing results
	IO.println("eno = " + eno + " employee details after updation");
	IO.println("  ename: " + ename);
	IO.println("    sal: " + sal);
	IO.println("   dept: " + dept);

	// 10. closing cstmt & con objects
	cstmt.close();
	con.close();
	IO.println("Resource closed");
    }
}