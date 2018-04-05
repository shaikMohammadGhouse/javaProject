package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Insert_jdbc 
{		
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
			
			Connection conn=null;
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
			
			
			
			///inserting value...
			PreparedStatement stmt=conn.prepareStatement("insert into first_jdbc Values(?,?)");

			stmt.setInt(1,105);
			stmt.setString(2,"shaik1234");
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
