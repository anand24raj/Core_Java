/*Program #8: Develop a program to retrieve data from the Course table and print on console */

package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test08_Stmt_SelectRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");

	IO.println("Connection is created");

	// 3. Creating Statement object
	Statement stmt = con.createStatement();
	IO.println("Statement is created");

	// 4. Preparing select query
	String selectQuery = """
		SELECT course_id, course_name, course_fee
		FROM   course ORDER BY course_id""";

	// 5. Executing the above select query and obtaining RS object
	ResultSet rs = stmt.executeQuery(selectQuery);

	// 6. retrieving results from DB by using RS object
	IO.println("\nTable data");
	IO.println("=======================================");
	while (rs.next()) {
	    IO.println(rs.getInt(1) + " " + rs.getString(2) + "\t" + rs.getDouble(3));
	}
	IO.println("=======================================");

	// 7.closing connections
	rs.close();
	stmt.close();
	con.close();
	IO.println("Resources Closed");
    }
}
