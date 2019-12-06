package code.dao;
import java.sql.*;

public class Factory {
	
	public static Connection conn = Connexion.getInstance();
	
	public static ApprenantDao getApprenantDao()
	{
		return new ApprenantDao(conn);
	}
	
	public static InstructeurDao getInstructeurDao()
	{
		return new InstructeurDao(conn);
	}
	
	public static ForumDao getForumDao()
	{
		return new ForumDao(conn);
	}
	
	public static CommentaireDao getCommentaireDao()
	{
		return new CommentaireDao(conn);
	}
	
	public static WikiDao getWikiDao()
	{
		return new WikiDao(conn);
	}
	
	public static CourDao getCourDao()
	{
		return new CourDao(conn);
	}
	
	public static QuizDao getQuizDao()
	{
		return new QuizDao(conn);
	}
	
	public static QuestionDao getQuestionDao()
	{
		return new QuestionDao(conn);
	}
	
	public static FormationDao getFormationDao()
	{
		return new FormationDao(conn);
	}
	
	public static DemandeDao getDemandeDao()
	{
		return new DemandeDao(conn);
	}
	
	public static SuivreDao getSuivreDao()
	{
		return new SuivreDao(conn);
	}
	
	public static RedistributionDao getRedistributionDao()
	{
		return new RedistributionDao(conn);
	}
	
	public static BlogDao getBlogDao()
	{
		return new BlogDao(conn);
	}
	

}
