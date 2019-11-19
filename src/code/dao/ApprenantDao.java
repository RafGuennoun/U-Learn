package code.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import code.classes.*;
public class ApprenantDao extends DAO<Apprenant,String>{
	
	public ApprenantDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`apprenant` WHERE idApp = ?"
					,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`apprenant` (`idApp`, `nomApp`, `prenomApp`, `email`, `dateN`, `niveau`, `pdp`, `mdp`)"
					+ " VALUES (?,?,?,?,?,?,?,?);");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`apprenant` set `nomApp`=?,`prenomApp`=?,`niveau`=?,`nbfs`=?,`nbff`=?,`pdp`=? WHERE `idApp`=?");
			this.deleteStat = this.conn.prepareStatement("DELETE from apprenant where idApp = ?");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Apprenant find(String idApp, String mdp) //throws MdpException
	{
		ResultSet res;
		Apprenant a = null;
		/*try
		{
			findStat.setString(1, idApp);
			res = findStat.executeQuery();
			Int mdp0;
			if(res.first())
			{
				a = new Apprenant(res.getString("idApp"),
						res.getString("nomApp"),
						res.getString("prenomApp"),
						res.getString("email"),
						res.getDate("dateN"),
						res.getInt("niveau"),
						res.getInt("nbfs"),
						res.getInt("nbff"),
						res.getBlob("pdp"));
			}*/
			
		//if(mdp0 = res.getInt("mdp"))
			return a;
		/*else
			throw new MdpException();*/
		/*}
		catch(Exception x)
		{
			x.printStackTrace();
		}*/
	}
	
	@Override
	public boolean insert(Apprenant a, String mdp)
	{
		Date d0 = a.getDateNaissance();
		java.sql.Date date = d0.dateToSql();
		
		int mdp0 = mdp.hashCode();
		try
		{
			InputStream img = new FileInputStream(new File(a.getPhoto()));
			
			insertStat.setString(1, a.getId());
			insertStat.setString(2, a.getNom());
			insertStat.setString(3, a.getPrenom());
			insertStat.setString(4, a.getEmail());
			insertStat.setDate(5, date);
			insertStat.setInt(6, a.getNiveau());
			insertStat.setBlob(7,img);
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
	public boolean update(Apprenant a)
	{
		try
		{
			InputStream img = new FileInputStream(new File(a.getPhoto()));
			
			updateStat.setString(1, a.getNom());
			updateStat.setString(2, a.getPrenom());
			updateStat.setInt(3, a.getNiveau());
			updateStat.setBlob(4, img);
			updateStat.setString(5, a.getId());
			
			return updateStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(Apprenant a)
	{
		try
		{
			deleteStat.setString(1, a.getId());
			return deleteStat.execute();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	

}
