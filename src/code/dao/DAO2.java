package code.dao;

import java.sql.*;
public abstract class DAO2 <T, S, C>{
	
	protected Connection conn = null;
	
	protected PreparedStatement findStat;
	protected PreparedStatement insertStat;
	protected PreparedStatement updateStat;
	protected PreparedStatement deleteStat;
	
	public DAO2(Connection conn)
	{
		this.conn = conn;
	}
	
	public abstract T find(S id);
	
	public abstract boolean insert(T obj,C createur);
	
	public abstract boolean update(T obj);
	
	public abstract boolean delete(T obj);

}


