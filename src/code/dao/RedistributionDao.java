package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RedistributionDao {
	
	private static Connection conn;
	
	public RedistributionDao(Connection conn)
	{
		this.conn = conn;
	}
	
	public ArrayList<String> find(int numW)
	{
		ArrayList<String> liste = new ArrayList<String>();
		try
		{
			PreparedStatement findStat = this.conn.prepareStatement("SELECT `user` FROM `u-learn`.`redistribution` WHERE `numW`=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			findStat.setInt(1, numW);
			
			ResultSet res = findStat.executeQuery();
			while(res.next())
			{
				liste.add(res.getString(1));
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return liste;
	}
	
	public boolean insert(int numW, String user)
	{
		try
		{
			PreparedStatement insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`redistribution`(`numW`, `user`) VALUES(?,?)");
			insertStat.setInt(1, numW);
			insertStat.setString(2, user);
			
			PreparedStatement findStat = this.conn.prepareStatement("SELECT `user` FROM `u-learn`.`redistribution` WHERE `numW`=? AND `user`=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			findStat.setInt(1, numW);
			findStat.setString(2, user);
			
			
			ResultSet res = findStat.executeQuery();
			if(res.first())
			{
				return true;
			}
			else
			{
				return insertStat.execute();
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(int numW)
	{
		try
		{
			PreparedStatement deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`redistribution` WHERE `numW`=?");
			deleteStat.setInt(1, numW);
			
			return deleteStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}

}
