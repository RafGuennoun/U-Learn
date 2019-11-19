package code.classes;

public class MdpException extends Exception{

	String erreur;
	
	public MdpException()
	{
		this.erreur = "Mot de passe incorrecte";
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
