package code.classes;

public class Cour {

	private  int numCour;
	private String nomCour;
	private String description;
	private String chemin;
	private int numFrm;
	
	
	public Cour(int num, String nom,String description, String chemin, int numFrm)
	{
		this.numCour = num;
		this.description=description;
		this.nomCour = nom;
		this.chemin = chemin;
		this.numFrm = numFrm;
	}
	
	
	public int getNumFrm() {
		return numFrm;
	}


	public void setNumFrm(int numFrm) {
		this.numFrm = numFrm;
	}


	public void setNumCour(int numCour) {
		this.numCour = numCour;
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

	
	
	
}
