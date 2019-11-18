package code.dao;
import java.sql.Connection;
import java.sql.ResultSet;

import code.classes.Blog;

public class BlogDao extends DAO2<Blog,Integer,String>{
	
	public BlogDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`blog` WHERE `numB`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`blog`(`nomB`,`textB`,`createurB`) "
					+ "VALUES(?,?,?);");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`blog`"
					+ "SET `nomB` = ?, `textB` = ?"
					+ "WHERE `numB` = ?");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`blog` WHERE `numB`=?");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Blog find(Integer id)
	{
		Blog b = null;
		try
		{
			findStat.setInt(1, id);
			
			ResultSet res = findStat.executeQuery();
			if(res.first())
			{
				b = new Blog(res.getInt(1),
							 res.getString(2),
							 res.getString(3));
			}
			
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return b;
	}
	
	@Override
	public boolean insert(Blog b, String createur)
	{
		try
		{
			insertStat.setString(1, b.getNomBlog());
			insertStat.setString(2, b.getTextBlog());
			insertStat.setString(3, createur);
			
			return insertStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Blog b)
	{
		try
		{
			updateStat.setString(1, b.getNomBlog());
			updateStat.setString(2, b.getTextBlog());
			updateStat.setInt(3, b.getNumBlog());
			
			return updateStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(Blog b)
	{
		try
		{
			deleteStat.setInt(1, b.getNumBlog());
			
			return deleteStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}

	
}
