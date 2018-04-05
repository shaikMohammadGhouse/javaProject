package main.java_project;
import java.io.BufferedReader;
import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdatedProject 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
		{
			int ch=0;
			Employee e = new Employee();
			String c=null;
			
			do
			{
			
				
				System.out.println("select the choice below.....");
				System.out.println("1.insert the employee details");
				System.out.println("2.display employee details");
				System.out.println("3.edit the employee with respect to eid::-");
				System.out.println("4.exit");
			
				Scanner sc=new Scanner(System.in);
				ch=sc.nextInt();
			
				Connection conn=null;
			
				Class.forName("com.mysql.jdbc.Driver");
			
				
			
				//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			
			//stmt.execute("CREATE TABLE Employee (EmployeeID int,FirstName varchar(255),LastName varchar(255),Email varchar(255),AddressLine varchar(255),City varchar(255));");
			//System.out.println("create table...done");
			
			
				
			/*
				switch (ch) 
				{
					case 1:	
					e.insertEmployeeDetails();
					  break;
					
				
				case 2:
					e.displayEmployee();
					break;
				
				case 3:
					
					e.editEmployee();
					
				
				case 4:
					System.out.println("thankyou");
					break;
				
				default:
						System.out.println("wrong choice.");
						break;
				}*/
				conn.close();
				
				System.out.println(" want to try again...(yes/no):-");
				c=sc.next();
				
				}while(c.equals("yes"));
			
	}
}
