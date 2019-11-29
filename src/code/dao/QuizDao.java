package code.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import code.classes.Quiz;

public class QuizDao extends DAO2<Quiz, Integer, Integer>{
	
	public QuizDao(Connection conn)
	{
		super(conn);
		
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`quiz` WHERE `numQz`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`quiz`(`numQz`, `nomQz`, `numFrm`) VALUES(?,?,?)");
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Quiz find(Integer id)
	{
		Quiz q = null;
		
		try
		{
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				q = new Quiz(res.getInt("numQz"), res.getString("nomQz"));
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
	public boolean insert(Quiz q, Integer numFrm)
	{
		try
		{
			insertStat.setInt(1, q.getNumQuiz());
			insertStat.setString(2, q.getNomQuiz());
			insertStat.setInt(3, numFrm);
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Quiz q)
	{
		return false;
	}
	
	@Override
	public boolean delete(Quiz q)
	{
		return false;
	}

}
