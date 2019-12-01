package code.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
