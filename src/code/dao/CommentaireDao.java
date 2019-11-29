package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import code.classes.Commentaire;

public class CommentaireDao {

	private Connection conn = null;
	
	public CommentaireDao(Connection conn)
	{
		this.conn = conn;
	}
	
	public Commentaire find(int id)
	{
		Commentaire c = null;
		try
		{
			PreparedStatement findStat =this.conn.prepareStatement("SELECT * FROM `u-learn`.`commentaire` WHERE `numCom`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			findStat.setInt(1, id);
			
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				c = new Commentaire(res.getInt("numCom"),
									res.getString("textCom"),
									res.getString("redacteur"));
				
			}
			
			return c;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return c;
	}
	
	public boolean insert(Commentaire c,int numF)
	{
	
		try
		{
			PreparedStatement insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`commentaire`(`numCom`, `textCom`, `numF`, `redacteur`)"
					+ "VALUES(?,?,?,?)");
			insertStat.setInt(1, c.getNumComm());
			insertStat.setString(2, c.getText());
			insertStat.setInt(3, numF);
			insertStat.setString(4, c.getCreateur());
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	
	public int getMaxNum(int numF)
	{
		try
		{
			PreparedStatement getMaxNum = this.conn.prepareStatement("SELECT max(numCom) as X FROM `u-learn`.`commentaire` WHERE `numF`=?");
			getMaxNum.setInt(1, numF);
			ResultSet res = getMaxNum.executeQuery();
			
			if(res.first())
			{
				return res.getInt("X");
			}
			
			return 0;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return 0;
	}
}
