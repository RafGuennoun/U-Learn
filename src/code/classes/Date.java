package code.classes;

public class Date {

	private int jour;
	private int mois;
	private int annee;
	
	public Date(int j, int m, int a)
	{
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}
