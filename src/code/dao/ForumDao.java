package code.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.xml.transform.Result;

import code.classes.Commentaire;
import code.classes.Forum;
public class ForumDao extends DAO2 <Forum,Integer,String>{
	
	public ForumDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`forum` WHERE `NumF`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`forum`(`nomF`, `desc`, `resolu`, `createur`) VALUES(?,?,?,?);");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`forum` SET `nomF`=?, `desc`=?, `resolu`=? WHERE `NumF`=?");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`forum` WHERE `NumF`=?");
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
	}
	
	
	@Override
	public Forum find(Integer id)
	{
		Forum f = null;
		
		try
		{
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			if(res.first())
			{
				f = new Forum(res.getInt("NumF"),
							  res.getString("nomF"),
							  res.getString("desc"),
							  res.getString("createur"));
			}
			
			PreparedStatement s = conn.prepareStatement("SELECT * FROM `u-learn`.`commentaire` WHERE `numF`=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			s.setInt(1, id);
			ResultSet resCom = s.executeQuery();
			
			while(resCom.next())
			{
				Commentaire c = new Commentaire(resCom.getInt("numCom"),
												resCom.getString("textCom"), 
												resCom.getString("redacteur"));
				f.commenter(c);
			}
			
			return f;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return f;
	}
	
	@Override
	public boolean insert(Forum f, String createur)
	{
		try
		{
			insertStat.setString(1, f.getNomForum());
			insertStat.setString(2, f.getProblemeForum());
			insertStat.setBoolean(3, f.isResolu());
			insertStat.setString(4, createur);
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Forum f)
	{
		try
		{
			updateStat.setString(1, f.getNomForum());
			updateStat.setString(2, f.getProblemeForum());
			updateStat.setBoolean(3, f.isResolu());
			updateStat.setInt(4, f.getNumForum());
			
			return updateStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(Forum f)
	{
		try
		{
			deleteStat.setInt(1, f.getNumForum());
			return deleteStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public int getMaxNum()
	{
		try
		{
			PreparedStatement s = conn.prepareStatement("SELECT max(NumF) as X FROM `u-learn`.`forum`;"); 
			ResultSet res = s.executeQuery();
			if(res.first())
				return res.getInt("X");
			else
				return 0;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return 0;
	}
	
	
	public ArrayList<Forum> getAll()
	{
		ArrayList<Forum> list = new ArrayList<Forum>();
		
		try
		{
			ResultSet res = this.conn.createStatement().executeQuery("SELECT `Numf` FROM `u-learn`.`forum`");
			while(res.next())
			{
				list.add(find(res.getInt(1)));
			}
			
			return list;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return list;
	}

}
