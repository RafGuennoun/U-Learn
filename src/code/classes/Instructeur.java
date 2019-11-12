package code.classes;

public class Instructeur extends Utilisateur{

	private String domaine;
	
	public Instructeur(String id,String n, String p, String e,Date d,Messagerie m,String domaine)
	{
		super(id,n,p,e,d,m);
		this.domaine = domaine;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
}
