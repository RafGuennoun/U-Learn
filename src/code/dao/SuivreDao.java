package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Suivre;

public class SuivreDao {
	
	private static Connection conn; 
	
	public SuivreDao(Connection conn)
	{
		this.conn = conn;
	}
	
	public Suivre find(String idApp, int numFrm)
	{
		Suivre s = null;
		try
		{
			PreparedStatement findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`suivre` WHERE `idApp`=? AND `numFrm`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			findStat.setString(1, idApp);
			findStat.setInt(2, numFrm);
			
			ResultSet res = findStat.executeQuery();
			if(res.first())
			{
				s = new Suivre(idApp,
							   numFrm,
							   res.getDouble("progres"),
							   res.getInt("nbEch"),
							   res.getDouble("noteQz"));
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return s;
	}
	
	public boolean insert(String idApp,int numFrm)
	{
		try
		{
			PreparedStatement insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`suivre`(`idApp`, `numFrm`, `progres`, `nbEch`, `noteQz`) VALUES(?,?,?,?,?)");
			insertStat.setString(1, idApp);
			insertStat.setInt(2, numFrm);
			insertStat.setDouble(3, 0.0);
			insertStat.setInt(4, 0);
			insertStat.setDouble(5, -1.0);
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public boolean update(Suivre s)
	{
		try
		{
			PreparedStatement updateStat = this.conn.prepareStatement("UPDATE `u-learn`.`suivre` SET `progres`=?, `nbEch`=?, `noteQz`=? WHERE `idApp`=? AND `numFrm`=?");
			updateStat.setDouble(1, s.getProgres());
			updateStat.setInt(2, s.getNbEch());
			updateStat.setDouble(3, s.getNoteQuiz());
			updateStat.setString(4, s.getIdApp());
			updateStat.setInt(5,s.getNumFrm());
			
			return updateStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(String idApp, int numFrm)
	{
		try
		{
			PreparedStatement deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`suivre` WHERE `idApp`=? AND `numFrm`=?");
			deleteStat.setString(1, idApp);
			deleteStat.setInt(2, numFrm);
			
			return deleteStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<Integer> getAll(String idApp)
	{
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		try
		{
			PreparedStatement findAllStat = this.conn.prepareStatement("SELECT `numFrm` FROM `u-learn`.`suivre` WHERE `idApp`=?");
			findAllStat.setString(1, idApp);
			
			ResultSet res = findAllStat.executeQuery();
			while(res.next())
			{
				liste.add(res.getInt("numFrm"));
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return liste;
	}
	public int getNbrApp(int numFrm)
	{
		int nbr = 0;
		
		try
		{
			PreparedStatement getNbr = this.conn.prepareStatement("SELECT count(*) as X FROM `u-learn`.`suivre` WHERE `numFrm`=?");
			getNbr.setInt(1, numFrm);
			
			ResultSet res = getNbr.executeQuery();
			if(res.first())
			{
				nbr = res.getInt(1);
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return nbr;
	}
	

}
