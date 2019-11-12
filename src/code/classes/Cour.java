package code.classes;

public class Cour {

	private final int numCour;
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

	private String nomCour;
	private String chemin;
	
	public Cour(int num, String nom, String chemin)
	{
		this.numCour = num;
		this.nomCour = nom;
		this.chemin = chemin;
	}
	
	
}
