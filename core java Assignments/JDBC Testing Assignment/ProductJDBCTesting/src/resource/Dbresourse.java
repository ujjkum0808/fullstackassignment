package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbresourse {
	
	static Connection con;
	public static Connection getDbConnection() 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "ujjwal");
		} 
		catch (Exception e) 
		{
			System.err.println("Driver Or Connecton related error "+e);
		}
		return con;
	}
	
	
	public void closeDbConnection() 
	{
		try
		{
			con.close();
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
