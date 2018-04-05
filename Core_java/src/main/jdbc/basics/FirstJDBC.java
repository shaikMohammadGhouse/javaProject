package main.jdbc.basics;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC 
{

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn=null;
		
		Driver drive;
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		
		
		try
		{
		Statement stmt=conn.createStatement();  
		  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from first_jdbc");  
		
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		  
		//step5 close the connection object  
		conn.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		conn.close();
		}  
	
}
