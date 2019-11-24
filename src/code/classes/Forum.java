package code.classes;

import java.util.ArrayList;
public class Forum {
	
	private int numForum;
	private String nomForum;
	private String problemeForum;
	private boolean resolu;
	private ArrayList<Commentaire> commentaires;
	
	public Forum()
	{
		this.resolu = false;
		this.commentaires = new ArrayList<Commentaire>(); 
	}
	
	public Forum(int num,String nom,String domaine)
	{
		this.numForum = num;
		this.nomForum = nom;
		this.problemeForum = domaine;
		this.resolu =false;
		this.commentaires = new ArrayList<Commentaire>(); 
	}

	public String getNomForum() {
		return nomForum;
	}

	public void setNomForum(String nomForum) {
		this.nomForum = nomForum;
	}

	public String getProblemeForum() {
		return problemeForum;
	}

	public void setProblemeForum(String domaineForum) {
		this.problemeForum = domaineForum;
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
		resolu = true;
	}
	
	public void commenter(Commentaire c)
	{
		this.commentaires.add(c);
	}
	
	

}
