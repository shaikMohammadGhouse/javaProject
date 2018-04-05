package main.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;

import java.sql.*;

public class Createquery {

	  public static void main(String[] args)
		  {
		    try
		    {
		    	String myDriver = "com.mysql.jdbc.Driver";
		    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Welcome@123");
		      Class.forName(myDriver);
		          
		      Calendar calendar = Calendar.getInstance();
		      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

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
