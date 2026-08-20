/*
 *	Develop a program to insert rows in course table with dynamic values
 *  read those values from the keyboard by using Java 25v IO.readln()
 *  
 *    query syntax by using TextBlock and format specifiers:
 *    	"""
 *    	INSERT INTO course(course_id, course_name, course_fee)
 *    	VALUES(%d, '%s', %f)
 *    	""";
 *    	
 *    for replacing format specifies, 
 *       we must call string.formatted(Object... args) method
 *       
 *    for example: we must call above method as 
 *    	query = query.formatted(courseId, courseName, courseFee); 
 *    	   
 */

//Test16_Stmt_DyVs_with_IO_TextBlocks.java
package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test16_Stmt_DyVs_with_IO_TextBlocks {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try (
		// 1. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
			"123");

		// 2. Creating Statement object
		Statement stmt = con.createStatement();) {
	    String option = "N";

	    do {
		// 3. Reading dynamic values using IO.readln()
		int courseId = Integer.parseInt(IO.readln("Enter courseId\t: "));
		String courseName = IO.readln("Enter courseName\t: ");
		double courseFee = Double.parseDouble(IO.readln("Enter courseFee\t: "));

		// 4. Creating query using TextBlock
		String query = """
			INSERT INTO course(course_id, course_name, course_fee)
			VALUES(%d, '%s', %f)""";

		// 5. Replacing format specifiers
		query = query.formatted(courseId, courseName, courseFee);

		// 6. Executing query
		stmt.executeUpdate(query);

		IO.println("1 row inserted.");

		option = IO.readln("\nDo you want to continue(Y/N)?: ");

	    } while (option.equalsIgnoreCase("Y"));

	    IO.println("_/\\_ Thank you, Visit Again _/\\_");

	} catch (SQLException e) {
	    e.printStackTrace();
	}

    }// main close
}// class close