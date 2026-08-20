/*Program #4: Develop a program to create 2 sequences for the tables 'Course and Student' in Oracle DB 
	1. Sequence creation Queries

		CREATE SEQUENCE course_seq 
		START WITH 1 
		INCREMENT BY 1;
		
		CREATE SEQUENCE student_seq 
		START WITH 101 
		INCREMENT BY 1;
			
	2. Query for retrieving all sequences created in the database
		SELECT SEQUENCE_NAME, MIN_VALUE, MAX_VALUE, INCREMENT_BY
		FROM USER_SEQUENCES;
	
	3. Query for retrieving current value and next value from sequence
		SELECT course_seq.nextval FROM dual;
		SELECT course_seq.currval FROM dual;
	   
	    - Rule: we must first access nextval,
		  then only we can access currval, else
		  we will get DB error

		- 'nextval' work as post increment operator
		  it returns the existing value from the sequence
		  and incresed by 1 in the sequence
		  
		- 'currval' returns the 'nextval' returned value
		
		- hence, we must alway access currval only after nextval,
		  else we will get sql error

   	 4. Query for alter sequence	
		Alter sequence course_seq 
		restart 
		start with <number>; */

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test04_Stmt_SequencesCreation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
	    // 1️ Load Oracle Driver
	    Class.forName("oracle.jdbc.OracleDriver");
	    IO.println("Driver Loaded");

	    // 2️ Connect to Database / 2. Establish Connection
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava","123");
	    IO.println("Connection is created");

	    // 3️ Create Statement
	    Statement stmt = con.createStatement();
	    IO.println("Statement is created");

	    // 4️ Create Sequences
	    String courseSeq = "CREATE SEQUENCE course_seq START WITH 1 INCREMENT BY 1";
	    String studentSeq = "CREATE SEQUENCE student_seq START WITH 101 INCREMENT BY 1";

	    stmt.execute(courseSeq);
	    IO.println("Course Sequence Created");

	    stmt.execute(studentSeq);
	    IO.println("Student Sequence Created");

	    // 5️ Close resources
	    stmt.close();
	    con.close();
	    IO.println("Resources Closed");
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
