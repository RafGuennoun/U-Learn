package code.classes;

public class Suivre {
	
	private String idApp;
	private int numFrm;
	private double progres;
	private int nbEch;
	private double noteQuiz;
	
	public Suivre(String idApp, int numFrm, double progres, int nbEch, double noteQz)
	{
		this.idApp = idApp;
		this.numFrm = numFrm;
		this.progres = progres;
		this.nbEch = nbEch;
		this.noteQuiz = noteQz;
	}

	public String getIdApp() {
		return idApp;
	}

	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}

	public int getNumFrm() {
		return numFrm;
	}

	public void setNumFrm(int numFrm) {
		this.numFrm = numFrm;
	}

	public double getProgres() {
		return progres;
	}

	public void setProgres(double progres) {
		this.progres = progres;
	}

	public int getNbEch() {
		return nbEch;
	}

	public void setNbEch(int nbEch) {
		this.nbEch = nbEch;
	}

	public double getNoteQuiz() {
		return noteQuiz;
	}

	public void setNoteQuiz(double noteQuiz) {
		this.noteQuiz = noteQuiz;
	}
	
	

}
