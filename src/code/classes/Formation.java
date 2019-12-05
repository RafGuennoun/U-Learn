package code.classes;

import java.util.ArrayList;
public class Formation {
	
	private  int numFormation;
	private String nomFormation;
	//niveau min pour s'inscrire à la formation
	private int niveauMin;
	private EnumDifficulte difficulte;
	private int dureeEstimee;
	private String description;
	private String createur;
	


	private ArrayList<Cour> listeCours;
	private Quiz quiz;
	

	
	public Formation(int num,String nom,String description,int niv,EnumDifficulte dif,int duree,String createur)
	{
		this.numFormation = num;
		this.nomFormation = nom;
		this.description=description;
		this.niveauMin = niv;
		this.difficulte = dif;
		this.dureeEstimee = duree;
		this.createur = createur;
		
		listeCours = new ArrayList<Cour>();
	}
	

	public String getCreateur() {
		return createur;
	}
	
	public void setCreateur(String createur) {
		this.createur = createur;
	}
	public ArrayList<Cour> getListeCours() {
		return listeCours;
	}

	public void setListeCours(ArrayList<Cour> listeCours) {
		this.listeCours = listeCours;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public void setNumFormation(int numFormation) {
		this.numFormation = numFormation;
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


	public int getNumFormation() {
		return numFormation;
	}


	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void ajouterCour(Cour c)
	{
		this.listeCours.add(c);
	}
	
	public String getDureeHeure()
	{
		return this.dureeEstimee+" Heures";
	}
	
	public String getNivString()
	{
		if(this.niveauMin==1)
		{
			return "L1";
		}
		else if(this.niveauMin==2)
		{
			return "L2";
		}
		else if(this.niveauMin==3)
		{
			return "L3";
		}
		else if(this.niveauMin==4)
		{
			return "M1";
		}
		else
		{
			return "M2";
		}
	}
	
	public double getPourcentageCour()
	{
		return (double)(1/(this.listeCours.size()+1));
	}



}
