package code.classes;

public class Question {
	private  int numQuestion;
	private String question;
	private String reponse1;
	private String reponse2;
	private String bonneRep;
	
	public Question()
	{
		
	}
	
	public Question(int num, String question, String reponse1, String reponse2,  String bonneRep)
	{
		this.numQuestion = num;
		this.question = question;
		this.reponse1=reponse1;
		this.reponse2=reponse2;
		this.bonneRep=bonneRep;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public int getNumQuestion() {
		return numQuestion;
	}


	public String getReponse2() {
		return reponse2;
	}

	
	public void setReponse2(String reponse2) {
		this.reponse2 = reponse2;
	}

	
	public String getReponse1() {
		return reponse1;
	}

	
	public void setReponse1(String reponse1) {
		this.reponse1 = reponse1;
	}

	
	public String getBonneRep() {
		return bonneRep;
	}

	
	public void setBonneRep(String bonneRep) {
		this.bonneRep = bonneRep;
	}

}
