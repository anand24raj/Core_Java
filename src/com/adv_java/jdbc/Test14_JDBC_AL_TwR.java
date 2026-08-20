// 14 Redevelop above JDBC program with AutoLoading feature

//Test14_JDBC_AL_TwR.java

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test14_JDBC_AL_TwR {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try (
		// 1. Establishing Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
			"123");

		// 2. Creating Statement
		Statement stmt = con.createStatement();

		// 3. Executing Query
		ResultSet rs = stmt.executeQuery("SELECT * FROM course ORDER BY course_id");) {
	    IO.println("Connection, Statement and ResultSet created");

	    // inside try block body, obtaining RSMD object
	    ResultSetMetaData rsmd = rs.getMetaData();

	    // 4. Fetching results from DB by using RS and RSMD objects
	    int count = 0;

	    if (rs.next()) {
		// Printing Column Names
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		    IO.print(rsmd.getColumnName(i) + "\t");
		}
		IO.println("\n-------------------------------------------");

		// Printing Rows
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
	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }
}