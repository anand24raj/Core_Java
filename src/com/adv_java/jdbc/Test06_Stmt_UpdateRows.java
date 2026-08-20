/*Program #6: Develop a program to update rows in course table 
	insert dummy courses from sql plus for update operation
	
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(101, 'Cr1', 3500);
 
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(102, 'Cr2', 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(103, 'Crs3', 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(104, 'Crs4', 3500);

	update fee whose course name contains Crs 	
	with the fee currentFee+1000*/

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test06_Stmt_UpdateRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
	    Class.forName("oracle.jdbc.OracleDriver");
	    IO.println("Driver is loaded");

	    // 2. Establishing connection
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
		    "123");
	    IO.println("Connection is created");

	    // 3. Creating Statement object
	    Statement stmt = con.createStatement();
	    IO.println("Statement is created");

	    String updateQuery = "UPDATE course SET course_fee = course_fee + 1000 WHERE course_name LIKE '%Crs%'";
	    int rows = stmt.executeUpdate(updateQuery);

	    System.out.println(rows + " Rows Updated Successfully");

	    stmt.close();
	    con.close();
	    IO.println("Resources Closed");

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}