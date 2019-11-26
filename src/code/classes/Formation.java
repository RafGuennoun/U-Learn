package code.classes;

import java.util.ArrayList;
public class Formation {
	
	private  int numFormation;
	private String nomFormation;
	//niveau min pour s'inscrire à la formation
	private int niveauMin;
	private EnumDifficulte difficulte;
	private int dureeEstimee;
	private int nbrCours;
	private String description;
	private boolean fini;
	
	private ArrayList<Cour> listeCours;
	private ArrayList<Quiz> listeQuiz;
	

	public Formation()
	{
		this.fini=false;
	}
	
	public Formation(int num,String nom,String description,int niv,EnumDifficulte dif,int duree,int nbrC, boolean fini)
	{
		this.numFormation = num;
		this.nomFormation = nom;
		this.description=description;
		this.niveauMin = niv;
		this.difficulte = dif;
		this.dureeEstimee = duree;
		this.nbrCours = nbrC;
		this.fini=fini;
	}
	
	public ArrayList<Cour> getListeCours() {
		return listeCours;
	}
	
	public ArrayList<Quiz> getListeQuiz() {
		return listeQuiz;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	public int getNiveauMin() {
		return niveauMin;
	}

	public void setNiveauMin(int niveauMin) {
		this.niveauMin = niveauMin;
	}

	public EnumDifficulte getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(EnumDifficulte difficulte) {
		this.difficulte = difficulte;
	}

	public int getDureeEstimee() {
		return dureeEstimee;
	}

	public void setDureeEstimee(int dureeEstimee) {
		this.dureeEstimee = dureeEstimee;
	}

	public int getNbrCours() {
		return nbrCours;
	}

	public void setNbrCours(int nbrCours) {
		this.nbrCours = nbrCours;
	}

	public int getNumFormation() {
		return numFormation;
	}


	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isFini() {
		return fini;
	}

	
	public void setFini(boolean fini) {
		this.fini = fini;
	}
	
	
	

}
