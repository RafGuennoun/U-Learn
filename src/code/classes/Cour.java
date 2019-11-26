package code.classes;

public class Cour {

	private  int numCour;
	private String nomCour;
	private String description;
	private String chemin;
	private boolean finis;
	
	public Cour()
	{
		this.setFinis(false);
	}
	
	public Cour(int num, String nom,String description, String chemin,boolean finis)
	{
		this.numCour = num;
		this.description=description;
		this.nomCour = nom;
		this.chemin = chemin;
		this.setFinis(finis);
	}
	
	
	public String getNomCour() {
		return nomCour;
	}

	public void setNomCour(String nomCour) {
		this.nomCour = nomCour;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public int getNumCour() {
		return numCour;
	}

	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public boolean isFinis() {
		return finis;
	}

	
	public void setFinis(boolean finis) {
		this.finis = finis;
	}
	
	
	


	
	
	
}
