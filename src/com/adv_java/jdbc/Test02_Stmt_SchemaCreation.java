 /*Program #2: Develop a program to create new schema(user) in Oracle DB
		Hint: first, connect to system schema and then run the 3 queries 
					1. alter session
					2. create user
					3. grant*/
	// sqlplus nareshit/anand@localhost:1521/FREEPDB1	

package com.adv_java.jdbc;
		
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
		
public class Test02_Stmt_SchemaCreation 
{
	public static void main(String[] args)throws ClassNotFoundException, SQLException 
	{		
		//1. Loading driver
		Class.forName("oracle.jdbc.OracleDriver");
		IO.println("Driver is loaded");
				
		//2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1","advancejava","123");
		IO.println("Connection is created");
				
		//3. Creating Statement object
//		Statement stmt = con.createStatement();
		IO.println("Statement is created");
				
		//4. Executing queries
//		stmt.execute("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
//		stmt.execute("CREATE USER nareshit IDENTIFIED BY anand");
//		stmt.execute("GRANT connect, resource, unlimited tablespace to nareshit");
//				
//		IO.println("User is created and DBA permissions are granted");
				
		//5. closing connections
//		stmt.close();
		con.close();
				
		IO.println("Resources Closed");				
	}
}
