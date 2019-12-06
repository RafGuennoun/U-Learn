package code.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Blog;
import code.classes.Date;
import code.classes.Wiki;

public class BlogDao extends DAO2<Blog,Integer,String>{
	
	public BlogDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`blog` WHERE `numB`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`blog`(`numB`, `nomB`, `textB`, `dateB`, `createurB`) "
					+ "VALUES(?,?,?,?,?);");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`blog`"
					+ "SET `nomB` = ?, `textB` = ?, `dateB` = ?"
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
			this.findStat.setInt(1, id);
			ResultSet res = this.findStat.executeQuery();
			
			
			if(res.first())
			{
				b = new Blog(res.getInt(1),
							 res.getString(2),
							 res.getString(3),
							 Date.sqlToDate(res.getDate("dateB")),
							 res.getString("createurB"));
			}
			
			PreparedStatement findImageStat = this.conn.prepareStatement("SELECT `imageB` FROM `u-learn`.`image_blog` WHERE `numB`=?", ResultSet.CONCUR_READ_ONLY);
			findImageStat.setInt(1, id);
			ResultSet resImg = findImageStat.executeQuery();
			
			while(resImg.next())
			{
				b.getPhotosAfficher().add(resImg.getBytes(1));
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
			insertStat.setInt(1, b.getNumBlog());
			insertStat.setString(2, b.getNomBlog());
			insertStat.setString(3, b.getTextBlog());
			insertStat.setDate(4, b.getDateBlog().dateToSql());
			insertStat.setString(5, createur);
			
			insertStat.execute();
			
			PreparedStatement insertImgStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`image_blog`(`numB`, `imageB`) VALUES(?,?)");
			
			InputStream i;
			for(String img : b.getPhotos())
			{
				i = new FileInputStream(new File(img));
				
				insertImgStat.setInt(1, b.getNumBlog());
				insertImgStat.setBlob(2, i);
				
				insertImgStat.execute();
			}
			
			return true;
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
			updateStat.setDate(3, b.getDateBlog().dateToSql());
			updateStat.setInt(4, b.getNumBlog());
			
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
			PreparedStatement deleteImg = this.conn.prepareStatement("DELETE FROM `u-learn`.`image_blog` WHERE `numB`=?");
			deleteImg.setInt(1, b.getNumBlog());
			deleteImg.execute();
			
			deleteStat.setInt(1, b.getNumBlog());
			
			return deleteStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public int getMaxNum()
	{
		try
		{
			PreparedStatement s = conn.prepareStatement("SELECT max(numB) as X FROM `u-learn`.`blog`;"); 
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
	
	public ArrayList<Blog> getAll()
	{
		ArrayList<Blog> list = new ArrayList<Blog>();
		
		try
		{
			ResultSet res = this.conn.createStatement().executeQuery("SELECT `numB` FROM `u-learn`.`blog`");
			while(res.next())
			{
				list.add(this.find(res.getInt(1)));
			}
			
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return list;
	}

	
}
