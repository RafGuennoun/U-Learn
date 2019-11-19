package code.classes;
public class Instructeur extends Utilisateur{

	private String domaine;
	
	public Instructeur(String id,String n, String p, String e,Date d,String domaine,String pdp)
	{
		super(id,n,p,e,d,pdp);
		this.domaine = domaine;
	}
	
	public Instructeur(String id,String n, String p, String e,Date d,String domaine,byte[] pdp)
	{
		super(id,n,p,e,d,pdp);
		this.domaine = domaine;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
}
