package code.classes;

import java.util.ArrayList;
public class Formation {
	
	private final int numFormation;
	private String nomFormation;
	//niveau min pour s'inscrire à la formation
	private int niveauMin;
	private Difficulte difficulte;
	private int dureeEstimee;
	private int nbrCours;
	
	private ArrayList<Cour> listeCours;
	private ArrayList<Quiz> listeQuiz;
	

	public Formation(int num,String nom,int niv,Difficulte dif,int duree,int nbrC)
	{
		this.numFormation = num;
		this.nomFormation = nom;
		this.niveauMin = niv;
		this.difficulte = dif;
		this.dureeEstimee = duree;
		this.nbrCours = nbrC;
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

	public Difficulte getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Difficulte difficulte) {
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
	
	
	

}
