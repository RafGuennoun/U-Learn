package code.classes;

public class ExisteException extends Exception{
	
	public String erreur;
	
	public ExisteException()
	{
		this.erreur = "Username already existess";
	}
	
	public String getErreur()
	{
		return this.erreur;
	}
	
	public void printErreur()
	{
		System.out.println(this.erreur);
	}

}
