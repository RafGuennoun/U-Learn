package code.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Forum;
import code.classes.Wiki;

public class WikiDao extends DAO2<Wiki,Integer,String>{

	
	public WikiDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`wiki` WHERE `numW`=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`wiki`(`numW`, `nomW`, `domaineW`, `idIns`, `textW`)"
					+ " VALUES(?,?,?,?,?)");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`wiki` SET `nomW`=?, `domaineW`=?, `textW`=? WHERE `numW`=?");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`wiki` WHERE `numW`=?");
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
	}
	
	public Wiki find(Integer id)
	{
		Wiki w = null;
		try
		{
			PreparedStatement findImageAfficheWiki = this.conn.prepareStatement("SELECT * FROM `u-learn`.`image_wiki` WHERE `numW`=?" );
			
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				w = new Wiki(id,
							 res.getString("nomW"),
							 res.getString("domaineW"),
							 res.getString("textW"),
							 res.getString("idIns"));
				
				findImageAfficheWiki.setInt(1, id);
				ResultSet resImg = findImageAfficheWiki.executeQuery();
				while(resImg.next())
				{
					w.ajouterImageAfficher(resImg.getBytes("imageW"));
				}
			}
			
			return w;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return w;
	}
	
	public boolean insert(Wiki w, String idInst)
	{
		try
		{
			PreparedStatement insertImgStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`image_wiki`(`numW`, `imageW`) VALUES(?,?)");
			
			insertStat.setInt(1, w.getNumWiki());
			insertStat.setString(2, w.getNomWiki());
			insertStat.setString(3, w.getDomaineWiki());
			insertStat.setString(4, idInst);
			insertStat.setString(5, w.getTextWiki());
		
			//inserer les images du wiki si il y en a
			InputStream i;
			for(String img : w.getImages())
			{
				i = new FileInputStream(new File(img));
				
				insertImgStat.setInt(1, w.getNumWiki());
				insertImgStat.setBlob(2, i);
				
				insertImgStat.execute();
			}
			
			return insertStat.execute();
		}
		catch(SQLException | IOException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public boolean update(Wiki w)
	{
		return false;
	}
	
	public boolean delete(Wiki w)
	{
		try
		{
			PreparedStatement deleteImages = this.conn.prepareStatement("DELETE FROM `u-learn`.`image_wiki` WHERE `numW`=?");
			deleteImages.setInt(1, w.getNumWiki());
			deleteImages.execute();
			
			deleteStat.setInt(1, w.getNumWiki());
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
			PreparedStatement s = conn.prepareStatement("SELECT max(numW) as X FROM `u-learn`.`wiki`;"); 
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
	
	public ArrayList<Wiki> getAll()
	{
		ArrayList<Wiki> list = new ArrayList<Wiki>();
		
		try
		{
			ResultSet res = this.conn.createStatement().executeQuery("SELECT `numW` FROM `u-learn`.`wiki`");
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
