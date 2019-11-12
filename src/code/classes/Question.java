package code.classes;

public class Question {
	private final int numQuestion;
	private String question;
	private String reponse;
	
	public Question(int num, String question, String reponse)
	{
		this.numQuestion = num;
		this.question = question;
		this.reponse = reponse;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public int getNumQuestion() {
		return numQuestion;
	}

}
