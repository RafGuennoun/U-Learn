package code.classes;
public class Apprenant extends Utilisateur{
	
	private int niveau;
	private int nbrFormationsFinies;
	private int nbrFormationsSivies;

	public Apprenant(String i,String n, String p, String e,Date d,Messagerie m,String pdp,int nv,int nff,int nfs)
	{
		super(i,n,p,e,d,m,pdp);
		this.niveau = nv;
		this.nbrFormationsSivies = nfs;
		this.nbrFormationsFinies = nff;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getNbrFormationsFinies() {
		return nbrFormationsFinies;
	}

	public void setNbrFormationsFinies(int nbrFormationsFinies) {
		this.nbrFormationsFinies = nbrFormationsFinies;
	}

	public int getNbrFormationsSivies() {
		return nbrFormationsSivies;
	}

	public void setNbrFormationsSivies(int nbrFormationsSivies) {
		this.nbrFormationsSivies = nbrFormationsSivies;
	}
	
	
}