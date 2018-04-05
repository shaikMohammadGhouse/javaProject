package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete_jdbc_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Connection conn=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		
		
		
		///inserting value...
		PreparedStatement stmt=conn.prepareStatement("delete from first_jdbc where number=?");
		

		stmt.setInt(1,102);
		stmt.executeUpdate();
		
		
		
		//displaying values..
		ResultSet rs=stmt.executeQuery("select * from first_jdbc");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"---"+rs.getString(2));
		}
		conn.close();
	}
	
}
