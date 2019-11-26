package code.classes;

import java.util.ArrayList;
public class Quiz {
	
	private final int numQuiz;
	private String nomQuiz;
	private ArrayList<Question> questions;
	private ArrayList<String> reponsesDonnees;
	
	public Quiz(int num, String nom)
	{
		this.numQuiz = num;
		this.nomQuiz = nom;
		this.questions = new ArrayList<Question>();
		this.reponsesDonnees = new ArrayList<String>();
	}

	public String getNomQuiz() {
		return nomQuiz;
	}

	public void setNomQuiz(String nomQuiz) {
		this.nomQuiz = nomQuiz;
	}

	public int getNumQuiz() {
		return numQuiz;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public ArrayList<String> getReponsesDonnees() {
		return reponsesDonnees;
	}
	
	public void ajouterQuestion(Question q)
	{
		this.questions.add(q);
	}
	
	public void donnerReponse(String r)
	{
		this.reponsesDonnees.add(r);
	}
	
	public float corriger()
	{
		int s=0;
		for(int i=0; i<this.questions.size(); i++)
		{
			if(questions.get(i).getBonneRep() == reponsesDonnees.get(i))
				s += 1;
		}
		
		return (float)(s*100)/(this.questions.size());
	}

}
