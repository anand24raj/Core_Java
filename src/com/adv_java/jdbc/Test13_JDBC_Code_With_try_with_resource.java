// 13 Redevelop a JDBC program by using 'try-with-resources' and 'catch-with-mulitple exceptions;

//Test13_JDBC_Code_With_try_with_resource.java
package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test13_JDBC_Code_With_try_with_resource {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
	    // 1. Loading Driver
	    Class.forName("oracle.jdbc.OracleDriver");
	    IO.println("Driver is loaded");

	    // 2. Try-With-Resources (JDBC Objects Creation)
	    try (
		    // 3. Establishing Connection
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1",
			    "advancejava", "123");

		    // 4. Creating Statement
		    Statement stmt = con.createStatement();

		    // 5. Executing Query
		    ResultSet rs = stmt.executeQuery("SELECT * FROM course ORDER BY course_id");) {
		IO.println("Connection, Statement and ResultSet created");

		// 6. inside try block body, obtaining RSMD object
		ResultSetMetaData rsmd = rs.getMetaData();

		// 7. Fetching results from DB by using RS and RSMD objects
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

	    } // try-with-resources closes automatically

	    IO.println("Resources Closed Automatically");

	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
    }
}