package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Cour;

public class CourDao extends DAO2<Cour,Integer,Integer>{
	
	public CourDao(Connection conn)
	{
		super(conn);
		
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`cours` WHERE `numC`=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`cours`(`numC`, `nomC`, `descC`, `numFrm`, `chemin`)"
					+ "VALUES(?,?,?,?,?);");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`cours` WHERE `numC`=? AND `numFrm`=?");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Cour find(Integer id)
	{
		Cour c = null;
		
		try
		{
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				c = new Cour(res.getInt("numC"),
							 res.getString("nomC"),
							 res.getString("descC"),
							 res.getString("chemin"),
							 res.getInt("numFrm"));
			}
			
			return c;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return c;
	}
	
	@Override
	public boolean insert(Cour c, Integer numFrm)
	{
		try
		{
			insertStat.setInt(1, c.getNumCour());
			insertStat.setString(2, c.getNomCour());
			insertStat.setString(3, c.getDescription());
			insertStat.setInt(4, numFrm);
			insertStat.setString(5, c.getChemin());
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Cour c)
	{
		return false;
	}
	
	@Override
	public boolean delete(Cour c)
	{
		try
		{
			deleteStat.setInt(1, c.getNumCour());
			deleteStat.setInt(2, c.getNumFrm());
			
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
			PreparedStatement stat = this.conn.prepareStatement("SELECT max(`numC`) FROM `u-learn`.`cours`");
			ResultSet res = stat.executeQuery();
			
			if(res.first())
			{
				return res.getInt(1);
			}
			else
			{
				return 0;
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return 0;
	}
	
	public ArrayList<Cour> getAll()
	{
		ArrayList<Cour> liste = new ArrayList<Cour>();
		try
		{
			PreparedStatement getAllStat = this.conn.prepareStatement("SELECT `numC` FROM `u-learn`.`cours`",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet res = getAllStat.executeQuery();
			
			while(res.next())
			{
				liste.add(Factory.getCourDao().find(res.getInt(1)));
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return liste;
	}
	

}
