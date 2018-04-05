package main.jdbc.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_app
{
	public static void main(String[] args) throws Exception 
	{
	
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		PreparedStatement stmt= conn.prepareStatement("insert into persons values (?,?,?,?)");
		
		
		do
		{
			//System.out.println("ennter id..");
			//int id=Integer.parseInt(br.readLine());
			
			System.out.println("enter last name...");
			String lname=br.readLine();
			
			
			System.out.println("enter last name...");
			String fname=br.readLine();
			
			System.out.println("enter the age");
			float salary=Integer.parseInt(br.readLine());

		//stmt.setInt(1, id);
		stmt.setString(2,lname);
		stmt.setString(3,fname);
		stmt.setFloat(4,salary);
		
		stmt.executeUpdate();
		
		
		System.out.println(stmt.executeUpdate()+"rows affected..");
		
		System.out.println("do you want to continue...(y/n)");

		String s=br.readLine();
		if(s.startsWith("n"))
		{
			break;
		}
		
		
		}
		while(true);
		
	
		
		conn.close();
	}
}
