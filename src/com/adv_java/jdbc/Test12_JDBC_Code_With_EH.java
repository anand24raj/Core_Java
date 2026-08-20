// 12 Develop a JDBC program to catch exception and to close connections in finally block	

//Test12_JDBC_Code_With_EH.java 

package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test12_JDBC_Code_With_EH {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. before try block, declaring reference variable with null
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
	    // 2. inside try block, creating JDBC objects
	    // 1. Loading Driver
	    Class.forName("oracle.jdbc.OracleDriver");
	    IO.println("Driver is loaded");

	    // 2. Establishing Connection
	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	    IO.println("Connection is created");

	    // 3. Creating Statement
	    stmt = con.createStatement();
	    IO.println("Statement is created");

	    // 4. Executing Query
	    rs = stmt.executeQuery("SELECT * FROM student ORDER BY sid");
	    ResultSetMetaData rsmd = rs.getMetaData();

	    // 5. Fetching Columns and Rows
	    int count = 0;

	    if (rs.next()) {
		// Printing Column Names
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		    IO.print(rsmd.getColumnName(i) + "\t");
		}
		IO.println("\n--------------------------------------------");

		// Printing Records
		do {
		    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			IO.print(rs.getString(i) + "\t");
		    }
		    IO.println();
		    count++;
		} while (rs.next());

		IO.println("\n" + count + " rows selected");
	    } else {
		IO.println("No rows selected");
	    }
	} catch (ClassNotFoundException e) {
	    IO.println("Driver class is not found");
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    // 6. Closing Resources in Reverse Order
	    try {
		if (rs != null)
		    rs.close();
	    } catch (SQLException e) {
	    }

	    try {
		if (stmt != null)
		    stmt.close();
	    } catch (SQLException e) {
	    }

	    try {
		if (con != null)
		    con.close();
	    } catch (SQLException e) {

	    }

	    IO.println("Resources Closed");
	}
    }
}