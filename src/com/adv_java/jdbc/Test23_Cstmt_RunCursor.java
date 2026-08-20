package com.adv_java.jdbc;

import java.sql.CallableStatement;

/*
Develop a program to run a cursor from Java application
	for reading all employees details from a given dept.

Step #1: Login to hknit4pm2 schema

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

Step #5:	Compile below procedure with cursor 
				for retrieving all employees records from DB
				from the given dept.

	CREATE or REPLACE PROCEDURE 
		getAllEmpDetailsFromDept(
			empdept			IN	VARCHAR2,
			dept_emp_cur	OUT	SYS_REFCURSOR
		 )
	IS 
	BEGIN
		OPEN dept_emp_cur FOR 

			SELECT *
			FROM	employee
			WHERE	dept LIKE empdept;

	END;
	/

Step #6: Run below application to execute above procedure
*/
//Test22_Cstmt_RunCursor.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

public class Test23_Cstmt_RunCursor {
    public static void main(String[] args) throws Exception {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connection is created");

	// Creating CallableStatement
	CallableStatement cstmt = con.prepareCall("{ call getAllEmpDetailsFromDept(?, ?) }");

	// registering out parameters
	cstmt.registerOutParameter(2, Types.REF_CURSOR);

	// reading dept

	String dept = IO.readln("Enter dept: ").toUpperCase();

	// setting eno to cstmt object IN parameter
	cstmt.setString(1, dept);

	// executing procedure with Cursor
	cstmt.execute();

	// reading results from OUT parameter, i.e; cursor
	Object obj = cstmt.getObject(2);
	ResultSet rs = (ResultSet) obj;

	// printing result
	if (rs.next()) {
	    // rows available, obtaining RSMD object
	    ResultSetMetaData rsmd = rs.getMetaData();

	    // retrieving number of columns
	    int noOfColumns = rsmd.getColumnCount();

	    // iterating over columns & printing column name
	    for (int i = 1; i <= noOfColumns; i++) {
		IO.print("\t" + rsmd.getColumnName(i));
	    }
	    IO.println("\n-----------------------------------\n");

	    // for counting number of rows
	    int count = 0;

	    // iterating over rows
	    // to read & print each column value from every row
	    do {
		// reading data from all columns of current row
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" 
//										+ rs.getDouble(3) + "\t" + rs.getString(4));

		for (int i = 1; i <= noOfColumns; i++) {
		    System.out.print("\t");
		    String value = rs.getString(i);
		    if (value != null) {
			IO.print(value);
		    }
		} // one row all columns data is printed

		// moving control to the next line on Console
		IO.println();

		// incrementing row count
		count++;

		// checking next row available or not
	    } while (rs.next());

	    // printing number of rows selected
	    IO.println("\n" + count + " rows selected.");
	} else {
	    IO.println("\nno rows selected.");
	}

	// closing cstmt & con objects
	cstmt.close();
	con.close();
	IO.println("Resource closed.");
	rs.close();
    }
}