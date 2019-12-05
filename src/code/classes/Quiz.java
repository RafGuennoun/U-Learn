package code.classes;

import java.util.ArrayList;
public class Quiz {
	
	private final int numQuiz;
	private String nomQuiz;
	private ArrayList<Question> questions;
	
	public Quiz(int num, String nom)
	{
		this.numQuiz = num;
		this.nomQuiz = nom;
		this.questions = new ArrayList<Question>();
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

	
	public void ajouterQuestion(Question q)
	{
		this.questions.add(q);
	}
	
	public double corriger()
	{
		int s=0;
		
		for(Question q : this.questions)
		{
			if(q.getBonneRep().equals(q.getRepDonnee()))
			{
				s++;
			}
		}
		
		return (double)((s*100)/this.questions.size());
	}

}
