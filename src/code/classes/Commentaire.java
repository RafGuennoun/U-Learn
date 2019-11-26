package code.classes;

public class Commentaire {

	private int numComm;
	private String text;
	private String createur;
	

	public Commentaire()
	{
		
	}
	
	public Commentaire(int num, String text, String c)
	{
		this.numComm = num;
		this.text = text;
		this.createur = c;
	}

	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public String getText() {
		return text;
	}

	public void modifierComm(String text) {
		this.text = text;
	}

	public int getNumComm() {
		return numComm;
	}
}
