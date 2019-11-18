package code.classes;
public class Instructeur extends Utilisateur{

	private String domaine;
	
<<<<<<< HEAD
	public Instructeur(String id,String n, String p, String e,Date d,Messagerie m,String pdp,String domaine)
=======
	public Instructeur()
	{
		
	}
	
	public Instructeur(String id,String n, String p, String e,Date d,Messagerie m,String domaine)
>>>>>>> fec61f5e116eff97b8e4b313cfdc10a03760dd01
	{
		super(id,n,p,e,d,m,pdp);
		this.domaine = domaine;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
}
