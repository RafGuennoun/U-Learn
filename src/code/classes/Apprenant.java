package code.classes;
public class Apprenant extends Utilisateur{
	
	private int niveau;

	public Apprenant(String i,String n, String p, String e,Date d,int nv,String pdp)
	{
		super(i,n,p,e,d,pdp);
		this.niveau = nv;
	}
	
	public Apprenant(String i,String n, String p, String e,Date d,int nv,byte[] pdp)
	{
		super(i,n,p,e,d,pdp);
		this.niveau = nv;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	
	
}