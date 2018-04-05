package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepare_select 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Connection conn=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		
		
		
		///inserting value...
		PreparedStatement stmt=conn.prepareStatement("select * from first_jdbc");		
		
		//displaying values..
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"---"+rs.getString(2));
		}
		conn.close();
	}
}
