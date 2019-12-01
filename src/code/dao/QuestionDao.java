package code.dao;

import java.awt.Insets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import code.classes.Question;

public class QuestionDao extends DAO2<Question, Integer, Integer>{
	
	public QuestionDao(Connection conn)
	{
		super(conn);
		
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`question` WHERE `numQ`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`question`(`numQ`, `question`, `reponse1`, `reponse2`, `bonneRep`, `numQz`"
					+ "VALUES(?,?,?,?,?,?);");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`question` WHERE `numQ`=? AND `numQz`=?");
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Question find(Integer id)
	{
		Question q = null;
		
		try
		{
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				q = new Question(res.getInt("numQ"),
								 res.getString("question"),
								 res.getString("reponse1"),
								 res.getString("reponse2"),
								 res.getString("bonneRep"),
								 res.getInt("numQz"));
			}
			
			return q;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return q;
	}
	
	@Override
	public boolean insert(Question q, Integer numQz)
	{
		try
		{
			insertStat.setInt(1, q.getNumQuestion());
			insertStat.setString(2, q.getQuestion());
			insertStat.setString(3, q.getReponse1());
			insertStat.setString(4, q.getReponse2());
			insertStat.setString(5, q.getBonneRep());
			insertStat.setInt(6, numQz);
			
			return insertStat.execute();
			
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Question q)
	{
		return false;
	}
	
	@Override
	public boolean delete(Question q)
	{
		try
		{
			deleteStat.setInt(1, q.getNumQuestion());
			deleteStat.setInt(2, q.getNumQz());
			
			return deleteStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}

}
