/*
 * Develop a program to load driver properties from properties file 
 * 
 * Test case: redevelop above program by applying
 * 				1. JDBC 4.0 feature 'Auto loading driver'
 *  			2. Java 7v  feature 'try-with-resources'
 */

//Test17_Stmt_PropertiesFile.java

package com.adv_java.jdbc;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test17_Stmt_PropertiesFile {
    public static void main(String[] args) throws IOException, SQLException {
	// Creating properties object
	Properties props = new Properties();

	// Loading properties file from classpath (src folder)
	try (InputStream is = Test17_Stmt_PropertiesFile.class.getClassLoader()
		.getResourceAsStream("driverinfo.properties")) {

	    if (is == null) {
		throw new RuntimeException("driverinfo.properties file not found in classpath");
	    }

	    props.load(is);
	}

	// reading properties and storing in local variables
	String driver = props.getProperty("DRIVER"); // not required in JDBC 4.0
	String url = props.getProperty("URL");
	String username = props.getProperty("USERNAME");
	String password = props.getProperty("PASSWORD");
	String query = props.getProperty("QUERY");

	// Auto-loading driver (JDBC 4.0 feature)
	try (Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();) {

	    IO.println("Connection and Statement created");

	    String option = "N";
	    do {
		// reading column values from end-user from keyboard
		// setting to query and running it on DB
		stmt.executeUpdate(query.formatted(Integer.parseInt(IO.readln("Enter courseId\t: ")),
			IO.readln("Enter courseName\t: "), Double.parseDouble(IO.readln("Enter courseFee\t: "))));

		IO.println("\n1 row inserted");

		option = IO.readln("Do you want to continue?(Y/N): ");

	    } while (option.equalsIgnoreCase("Y"));

	    IO.println("_/\\_ Thank you, Visit Again _/\\_");

	} // try-with-resources auto closes

    }// main method close
}// class close