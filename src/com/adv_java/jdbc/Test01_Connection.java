/*Program #1: Develop a program to establish connection to the Oracle DB*/

//Test01_Connection.java
package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Test01_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connection is created");

	// 3. Printing connection object class name
	IO.println("con: " + con);

	// 4. Closing connection
	con.close();
	IO.println("Resource Closed");
    }// main close
}// class close
