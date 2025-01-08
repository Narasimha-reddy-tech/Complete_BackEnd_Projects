package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. loading the driver class
		
		  Class.forName("com.mysql.jdbc.Driver");
		
		// 2. get the connection
		  
		   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_dec16","root", "Vvsnr6303@#");
		  
		// 3. create a statement
		   
		 Statement stmt=  conn.createStatement(); 
		   
		// 4. execute the statement
		 // mthds    ddl - execute()  dml- executeUpdate()    drl- executeQuery()
		 
//		 boolean result= stmt.execute("create table stud(studid int,studname varchar(20),studadd varchar(20))");
		 
//		       int result= stmt.executeUpdate("insert into stud values(10,'soma','goa')");
		 
		         int delet= stmt.executeUpdate("delete from stud where studid=10");
		 
		         /* int upd = stmt.executeUpdate("update stud set studname='bhima' where studid=10");
		 
		       ResultSet rs=   stmt.executeQuery("select * from stud");
		       
		            while(rs.next()) {
		            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3));
		            }
		       */
		      
		       
		       
		 
		// 5. close connection
		
		 conn.close();
//		 System.out.println("table inserted:"+result);
		 
		 
		
	}
}

