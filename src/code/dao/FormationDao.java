package code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import code.classes.Cour;
import code.classes.EnumDifficulte;
import code.classes.Formation;

public class FormationDao extends DAO2<Formation, Integer, String>{
	
	public FormationDao(Connection conn)
	{
		super(conn);
		
		try
		{
			this.findStat = this.conn.prepareStatement("SELECT * FROM `u-learn`.`formation` WHERE `numFrm`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			this.insertStat = this.conn.prepareStatement("INSERT INTO `u-learn`.`formation`(`numFrm`, `nomFrm`, `nivMin`, `difficulte`, `dure`, `descFrm`, `idIns`)"
					+ "VALUES(?,?,?,?,?,?,?)");
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
	}
	
	@Override
	public Formation find(Integer id)
	{
		Formation f= null;
		
		try
		{
			PreparedStatement findCoursStat = this.conn.prepareStatement("SELECT `numC` FROM `u-learn`.`cours` WHERE `numFrm`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			PreparedStatement findQuizStat = this.conn.prepareStatement("SELECT `numQz` FROM `u-learn`.`quiz` WHERE `numQz`=?",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			findStat.setInt(1, id);
			ResultSet res = findStat.executeQuery();
			
			if(res.first())
			{
				EnumDifficulte ed = EnumDifficulte.transform(res.getString("difficulte")); 
				
				f = new Formation(id,
								  res.getString("nomFrm"),
								  res.getString("descFrm"),
								  res.getInt("nivMin"),
								  ed,
								  res.getInt("dure"),
								  res.getString("idIns"));
				
				ResultSet resC = findCoursStat.executeQuery();
				while(resC.next())
				{
					f.ajouterCour(Factory.getCourDao().find(resC.getInt(1)));
				}
				
				ResultSet resQ = findQuizStat.executeQuery();
				if(resQ.first())
				{
					f.setQuiz(Factory.getQuizDao().find(resQ.getInt(1)));
				}
				
			}
			
			return f;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return f;
	}
	
	@Override
	public boolean insert(Formation f, String createur)
	{
		try
		{
			insertStat.setInt(1, f.getNumFormation());
			insertStat.setString(2, f.getNomFormation());
			insertStat.setInt(3, f.getNiveauMin());
			insertStat.setString(4, f.getDifficulte().getDesc());
			insertStat.setInt(5, f.getDureeEstimee());
			insertStat.setString(6, f.getDescription());
			insertStat.setString(7, createur);
			
			insertStat.execute();
			
			for(Cour c : f.getListeCours())
			{
				Factory.getCourDao().insert(c, f.getNumFormation());
			}
			
			Factory.getQuizDao().insert(f.getQuiz(), f.getNumFormation());
			
			return true;
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(Formation f)
	{
		return false;
	}
	
	@Override
	public boolean delete(Formation f)
	{
		try
		{
			deleteStat.setInt(1, f.getNumFormation());
			
			Factory.getQuizDao().delete(f.getQuiz());
			
			for(Cour c : f.getListeCours())
			{
				Factory.getCourDao().delete(c);
			}
			
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
			PreparedStatement stat = this.conn.prepareStatement("SELECT max(`numFrm`) FROM `u-learn`.`formation`");
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
	
	public ArrayList<Formation> getAll()
	{
		ArrayList<Formation> liste = new ArrayList<Formation>();
		
		try
		{
			PreparedStatement findAllStat = this.conn.prepareStatement("SELECT `numFrm` FROM `u-learn`.`formation`",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet res = findAllStat.executeQuery();
			
			while(res.next())
			{
				liste.add(this.find(res.getInt(1)));
			}
			
		}
		catch(SQLException x)
		{
			x.printStackTrace();
		}
		
		return liste;
	}

}
