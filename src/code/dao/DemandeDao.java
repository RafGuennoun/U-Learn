package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Demande;
import code.classes.ExisteException;
import code.classes.MdpException;

public class DemandeDao {
	
	private static Connection conn = null;
	
	public DemandeDao(Connection conn)
	{
		this.conn = conn;
	}
	
	public Demande find(String idApp, int numFrm)
	{
		Demande d = null;
		try
		{
			
			PreparedStatement findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`demande` WHERE `idApp`=? AND `numFrm`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			findStat.setString(1, idApp);
			findStat.setInt(2, numFrm);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				PreparedStatement findTitreStat = this.conn.prepareStatement("SELECT `nomFrm` FROM `u-learn`.`formation` WHERE `numFrm`=?");
				findTitreStat.setInt(1, numFrm);
				
				ResultSet resTitre = findTitreStat.executeQuery();
				
				if(resTitre.first())
				{
					d = new Demande(Factory.getApprenantDao().find(idApp,"-1"),
							numFrm,
							resTitre.getString(1),
							res.getBoolean("accepte"));
				}
				
				
				
			}
			
		}
		catch(SQLException | ExisteException | MdpException x)
		{
			x.printStackTrace();
		}
		
		return d;
	}
	
	public boolean insert(Demande d)
	{
		try
		{
			PreparedStatement insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`demande`(`idApp`, `numFrm`, `accepte`) VALUES(?,?,?)");
			insertStat.setString(1, d.getApprenant().getId());
			insertStat.setInt(2, d.getNumFrm());
			insertStat.setBoolean(3, d.isAccepte());
			
			return insertStat.execute();
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	public ArrayList<Demande> getAll(String idIns)
	{
		ArrayList<Demande> liste = new ArrayList<Demande>();
		
		try
		{
			PreparedStatement findAllform = this.conn.prepareStatement("SELECT `numFrm` FROM `u-learn`.`formation` WHERE `idIns`=?");
			PreparedStatement findAlldem = this.conn.prepareStatement("SELECT * FROM `u-learn`.`demande` WHERE `numFrm`=?");
			
			findAllform.setString(1, idIns);
			ResultSet resF = findAllform.executeQuery();
			while(resF.next())
			{
				findAlldem.setInt(1, resF.getInt("numFrm"));
				ResultSet res = findAlldem.executeQuery();
				
				while(res.next())
				{
					liste.add(find(res.getString("idApp"), res.getInt("numFrm")));
				}
			}
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return liste;
	}
	
	public boolean delete(String idApp, int numFrm)
	{
		try
		{
			PreparedStatement deleteStat = this.conn.prepareStatement("DELETE FROM `u-learn`.`demande` WHERE `idApp`=? AND `numFrm`=?");
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
	

}
