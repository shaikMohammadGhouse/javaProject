package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class User1Class
{
	public static void main(String[] args)
	  {
	    try
	    {
	    	String myDriver = "com.mysql.jdbc.Driver";
	    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
	      Class.forName(myDriver);
	          
	      Calendar calendar = Calendar.getInstance();
	      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

	      
	   /*   System.out.println("enter firstname....");
	      String fname=br.readLine();
	      

	      System.out.println("enter last name...");
		  String lname=br.readLine();
		  
		  System.out.println("is_admin..?");
		  boolean admin=Integer.parseInt(br.readLine());
		  
		  System.out.println("numpoints....");
		  boolean admin=Integer.parseInt(br.readLine());
		  
		  */
	      String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
	        + " values (?, ?, ?, ?, ?)";

	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, "Barney");
	      preparedStmt.setString (2, "Rubble");
	      preparedStmt.setDate   (3, startDate);
	      preparedStmt.setBoolean(4, false);
	      preparedStmt.setInt    (5, 5000);

	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	  }

}
