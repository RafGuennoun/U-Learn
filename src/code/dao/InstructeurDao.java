package code.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import code.classes.Date;
import code.classes.ExisteException;
import code.classes.Instructeur;
import code.classes.MdpException;

public class InstructeurDao extends DAO<Instructeur, String>{
	
	public InstructeurDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * from `u-learn`.`instructeur` WHERE idIns = ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-lear`.`instructeur` (`idIns`, `nomIns`, `prenomIns`, `email`, `dateN`, `domaineIns`, `pdp`"
					+ "VALUES(?,?,?,?,?,?,?");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`-`instructeur` SET"
					+ "`nomIns`=?, `prenomIns`=?, `domainIns`=?, `pdp`=?"
					+ "WHERE `idIns`=?");
			this.deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`-`instructeur` WHERE `idIns`=?");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Instructeur find(String id, String mdp) throws MdpException
	{
		Instructeur i = null;
		
		int mdp0 = mdp.hashCode();
		try
		{
			ResultSet res = findStat.executeQuery();
			if(mdp0 == res.getInt("mdp"))
			{
				byte[] img = res.getBytes("pdp");
				Date date = Date.sqlToDate(res.getDate("dateN"));
				
				i = new Instructeur(res.getString("idIns"),
									res.getString("nomIns"),
									res.getString("prenomIns"),
									res.getString("eamil"),
									date,
									res.getString("domaineIns"),
									img);
									
									
			}
			else
			{
				throw new MdpException();
			}
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return i;
	}
	
	@Override
	public boolean insert(Instructeur i, String mdp) throws ExisteException
	{
		
		try
		{
			findStat.setString(1, i.getId());
			ResultSet res = findStat.executeQuery();
			if(res.first())
			{
				throw new MdpException();
			}
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		Date d0 = i.getDateNaissance();
		java.sql.Date date = d0.dateToSql();
		int mdp0 = mdp.hashCode();
		
		try
		{
			InputStream img = new FileInputStream(new File(i.getPhoto()));
			
			insertStat.setString(1, i.getId());
			insertStat.setString(2, i.getNom());
			insertStat.setString(3, i.getPrenom());
			insertStat.setString(4, i.getEmail());
			insertStat.setDate(5, date);
			insertStat.setString(6, i.getDomaine());
			insertStat.setBlob(7, img);
			insertStat.setInt(8, mdp0);
			
			return insertStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Instructeur i)
	{
		try
		{
			InputStream img = new FileInputStream(new File(i.getPhoto()));
			
			updateStat.setString(1, i.getNom());
			updateStat.setString(2, i.getPrenom());
			updateStat.setString(3, i.getDomaine());
			updateStat.setBlob(4, img);
			updateStat.setString(5, i.getId());
			
			return updateStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(Instructeur i)
	{
		try
		{
			deleteStat.setString(1, i.getId());
			
			return deleteStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}

}
