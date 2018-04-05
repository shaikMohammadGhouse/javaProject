package main.java_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Employee 
{/*
	ch=sc.nextInt();

	Connection conn=null;

	Class.forName("com.mysql.jdbc.Driver");

	Statement stmt=conn.createStatement();
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");

	void insertEmployeeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome enterr the following details.....");
		System.out.println("enter employee ID");
		int id=sc.nextInt();
		
		System.out.println("enter the fname");
		String fname=sc.next();
		
		System.out.println("enter the last name.....");
		String lname=sc.next();
		
		
		System.out.println("enter the email");
		String email=sc.next();
		
		System.out.println("enter the address");
		String address=sc.next();
						
		System.out.println("enter the city");
		String city=sc.next();
		
		
		//stmt.executeUpdate("insert into Employee (EmployeeID, FirstName, LastName) values("+id+",'"+fname+"','"+lname+")");
		
		
		
		
		String query="insert into Employee (EmployeeID, FirstName, LastName, Email, AddressLine,City )"+" values (?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt (1, id);
	      preparedStmt.setString (2,fname);
	      preparedStmt.setString(3,lname);
	      preparedStmt.setString (4,email);
	      preparedStmt.setString(5,address);
	      preparedStmt.setString (6,city);
	    
	      
	      //preparedStmt.setBoolean(4, false);
	     // preparedStmt.setInt    (5, 5000);
	      preparedStmt.execute();
		
		
		System.out.println("...insertion done...");
		stmt.close();
		break;
	}
	
	
	void displayEmployee()
	{
		System.out.println("displaying the employee details........");
		ResultSet rs=stmt.executeQuery("Select * from Employee;");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+rs.getString(4)+" "+rs.getString(6));  
		stmt.close();
	}
	
	void editEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id to change the city..");
		int eid=sc.nextInt();
		
		ResultSet rs1=stmt.executeQuery("Select * from Employee;");
		while(rs1.next())  
			if(rs1.getInt(1)==eid)
			{
									
				System.out.println("enter new city name of employee.."+eid);
				String cityimp=sc.next();
				
				stmt.executeUpdate("Update Employee set City='"+cityimp+"' where EmployeeID="+eid);
				System.out.println("the database is updated..");
				
				break;
			}
			else
				System.out.println("unknown employee sorry we cant  Proceed thankyou!....");
		break;
	}*/
}
