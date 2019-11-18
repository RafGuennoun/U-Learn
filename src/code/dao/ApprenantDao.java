package code.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;

import code.classes.Apprenant;
import code.classes.Date;
public class ApprenantDao extends DAO<Apprenant,String>{
	
	public ApprenantDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM apprenant WHERE idApp = ?"
					,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`apprenant` (`idApp`, `nomApp`, `prenomApp`, `email`, `dateN`, `niveau`, `nbfs`, `nbff`, `pdp`)"
					+ " VALUES (?,?,?,?,?,?,?,?,?);");
			this.updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`apprenant` set `nomApp`=?,`prenomApp`=?,`niveau`=?,`nbfs`=?,`nbff`=?,`pdp`=? WHERE `idApp`=?");
			this.deleteStat = this.conn.prepareStatement("DELETE from apprenant where idApp = ?");
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Apprenant find(String idApp)
	{
		ResultSet res;
		Apprenant a = null;
		/*try
		{
			findStat.setString(1, idApp);
			res = findStat.executeQuery();
			
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
			
			return a;
		/*}
		catch(Exception x)
		{
			x.printStackTrace();
		}*/
	}
	
	@Override
	public boolean insert(Apprenant a)
	{
		Date d0 = a.getDateNaissance();
		java.sql.Date date = d0.dateToSql();
		try
		{
			InputStream img = new FileInputStream(new File(a.getPhoto()));
			
			insertStat.setString(1, a.getId());
			insertStat.setString(2, a.getNom());
			insertStat.setString(3, a.getPrenom());
			insertStat.setString(4, a.getEmail());
			insertStat.setDate(5, date);
			insertStat.setInt(6, a.getNiveau());
			insertStat.setInt(7, a.getNbrFormationsSivies());
			insertStat.setInt(8, a.getNbrFormationsFinies());
			insertStat.setBlob(9,img);
			
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
			updateStat.setInt(4, a.getNbrFormationsSivies());
			updateStat.setInt(5, a.getNbrFormationsFinies());
			updateStat.setBlob(6, img);
			updateStat.setString(7, a.getId());
			
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
