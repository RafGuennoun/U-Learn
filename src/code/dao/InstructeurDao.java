package code.dao;

import java.sql.Connection;

import code.classes.Date;
import code.classes.Instructeur;

public class InstructeurDao extends DAO<Instructeur, String>{
	
	public InstructeurDao(Connection conn)
	{
		super(conn);
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * from `u-learn`.`instructeur` WHERE idIns = ?");
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
	public Instructeur find(String id)
	{
		Instructeur i = null;
		return i;
	}
	
	@Override
	public boolean insert(Instructeur i)
	{
		Date d0 = i.getDateNaissance();
		java.sql.Date date = d0.dateToSql();
		try
		{
			findStat.setString(1, i.getId());
			findStat.setString(2, i.getNom())
			findStat.setString(3, i.getPrenom());
			findStat.setString(4, i.getEmail());
			findStat.set
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}

}
