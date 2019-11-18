package code.classes;
public class Apprenant extends Utilisateur{
	
	private int niveau;
	private int nbrFormationsFinies;
	private int nbrFormationsSivies;

<<<<<<< HEAD
	public Apprenant(String i,String n, String p, String e,Date d,Messagerie m,String pdp,int nv,int nff,int nfs)
=======
	
	public Apprenant()
	{
		
	}
	
	public Apprenant(String i,String n, String p, String e,Date d,Messagerie m,int nv,int nff,int nfs)
>>>>>>> fec61f5e116eff97b8e4b313cfdc10a03760dd01
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