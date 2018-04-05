package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_jdbc 
{

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn=null;
		int roll=0;
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		
		
		try
		{
		Statement stmt=conn.createStatement();  

		System.out.println("enter the roll number to be deleted.....");
		Scanner sc =new Scanner(System.in);
		roll=sc.nextInt();
		
		int res=stmt.executeUpdate("delete from first_jdbc where number="+roll);  
		
		System.out.println(res); 

		conn.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		conn.close();
		}  
	
}
