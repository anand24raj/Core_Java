/**
 * Develop a program to insert rows in Course table by using PStmt object
 * 	1. use pre-compiled Insert Query
 * 	2. use course_seq for setting course_id column value 
 * 	3. read courseName and curseFee from end user
 * 	4. use auto loading driver and IO class 
 *  5. donn't use try-with-resources, close connections in finally block 
 */

//Test18_PStmt_PreCompiled_Insert.java
package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test18_PStmt_PreCompiled_Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con = null;
	PreparedStatement pstmt = null;

	try {
	    // Auto-loading driver (JDBC 4.x feature)
	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");

	    // 1. PreparedStatement object is created with
	    // pre-compiled INSERT query with IN parameters
	    pstmt = con.prepareStatement("""
	    	INSERT INTO course(course_id, course_name, course_fee)
	    	VALUES(course_seq.nextval, ?, ?)""");

	    IO.println("con and pstmt objects are created");

	    String option = "N";
	    do {

		// 2. reading values from keyboard
		IO.println("Reading course values");
		String courseName = IO.readln("  Enter courseName: ");
		double courseFee = Double.parseDouble(IO.readln("  Enter courseFee : "));

		// 3. setting above values to pstmt object
		pstmt.setString(1, courseName);
		pstmt.setDouble(2, courseFee);
		IO.println("Values are set to pstmt object");

		// 4. executing pstmt object query with the above values
		IO.println("Executing query ....");

		pstmt.executeUpdate(); // no-param execute method

		// 5. printing result
		IO.println("1 row inserted");

		option = IO.readln("\nDo you want to continue?(Y/N): ");

	    } while (option.equalsIgnoreCase("Y"));

	    IO.println("Thank you, visit again");

	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    try {
		// 7. closing pstmt object
		if (pstmt != null) {
		    pstmt.close();
		    pstmt = null;
		}
	    } catch (SQLException e) {
	    }

	    try {
		if (con != null) {
		    con.close();
		    con = null;
		}
	    } catch (SQLException e) {
	    }
	}

    }// main close
}// class close