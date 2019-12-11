package code.classes;

public class Demande {
	
	private Apprenant apprenant;
	private int numFrm;
	private String titreFrm;
	private boolean accepte;
	
	public Demande(Apprenant a,int numf,String titre,boolean accepte)
	{
		this.apprenant=a;
		this.numFrm = numf;
		this.titreFrm = titre;
		this.accepte=accepte;
	}

	public Apprenant getApprenant() {
		return apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	public boolean isAccepte() {
		return accepte;
	}
	
	public void accepter()
	{
		this.accepte = true;
	}

	public int getNumFrm() {
		return numFrm;
	}

	public void setNumFrm(int numFrm) {
		this.numFrm = numFrm;
	}

	public String getTitreFrm() {
		return titreFrm;
	}

	public void setTitreFrm(String titreFrm) {
		this.titreFrm = titreFrm;
	}

}
