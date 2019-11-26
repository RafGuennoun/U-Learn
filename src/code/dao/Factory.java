package code.dao;
import java.sql.*;

public class Factory {
	
	public static Connection conn = Connexion.getInstance();
	
	public static ApprenantDao getApprenantDao()
	{
		return new ApprenantDao(conn);
	}
	
	public static InstructeurDao getInstructeurDao()
	{
		return new InstructeurDao(conn);
	}

}
