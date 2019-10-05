package Jdbs;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionManager {
	public static void main (String []args) throws ClassNotFoundException, SQLException
	{

	
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");  
	
	if (con != null)
	{
		System.out.println("Connected");
	}
	else
	{
		System.out.println("not Connected");
	}
	Statement statement = (Statement) con.createStatement();
	statement.executeUpdate ("INSERT INTO department VALUES (1002,'achayanz')");
	

	}



}
