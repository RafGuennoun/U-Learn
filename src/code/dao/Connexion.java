package code.dao;

import java.sql.*;

//le patron de conception 'Singleton' a �t� appliqu� a cette classe pour la connexion � la base de donn�es, on a utilis� un constructeur priv�
//qui assure l'instan�iation qu'une et une seule fois. Ainsi que la methode static get instance pour acceder � l'instan�iation
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
			
			this.conn = DriverManager.getConnection(url,user,psswrd);
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
