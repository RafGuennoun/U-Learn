package code.classes;

import java.util.ArrayList;
public class Forum {
	
	private int numForum;
	private String nomForum;
	private String problemeForum;
	private boolean resolu;
	private String createur; 
	private ArrayList<Commentaire> commentaires;
	
	public Forum()
	{
		this.commentaires = new ArrayList<Commentaire>(); 
	}
	
	
	public Forum(int num,String nom,String p,boolean resolu,String c)
	{
		this.numForum = num;
		this.nomForum = nom;
		this.problemeForum = p;
		this.createur = c;
		this.resolu=resolu;
		this.commentaires = new ArrayList<Commentaire>(); 
	}

	
	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}


	public String getNomForum() {
		return nomForum;
	}

	public void setNomForum(String nomForum) {
		this.nomForum = nomForum;
	}

	public int getNumForum() {
		return numForum;
	}

	public boolean isResolu() {
		return resolu;
	}

	public ArrayList<Commentaire> getCommentaires() {
		return commentaires;
	}
	
	public void resoudre()
	{
		this.resolu = true;
	}
	
	public void commenter(Commentaire c)
	{
		this.commentaires.add(c);
	}
	
	public String getProblemeForum() {
		return problemeForum;
	}
	
	public void setProblemeForum(String problemeForum) {
		this.problemeForum = problemeForum;
	}

}
