package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class Column_name 
{
	
	public static void main(String[] args) {
		
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		PreparedStatement ps=conn.prepareStatement("select * from emp");  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
		  
		 
		System.out.println("Column Name of 2ndt column: "+rsmd.getColumnName(2));  
		System.out.println("Column Type Name of 2nd column: "+rsmd.getColumnTypeName(2));  
		conn.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
