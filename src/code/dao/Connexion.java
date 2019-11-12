package code.dao;

import java.sql.*;
public class Connexion {

	private static Connection conn = null;
	
	private static String url = "jdbc:mysql://localhost/u-learn";
	private static String user ="root";
	private static String psswrd = "";
	
	private Connexion()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver OK");
			
			this.conn = DriverManager.getConnection(url,user,psswrd);
			System.out.println("Connection OK");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	public static Connection getInstance()
	{
		if(conn == null)
		{
			try
			{
				new Connexion();
			}
			catch(Exception x)
			{
				x.printStackTrace();
			}
		}
		
		return conn;
	}
	
}
