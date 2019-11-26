package code.classes;

public class MdpException extends Exception{

	String message;
	
	public MdpException()
	{
		this.message = "Incorrect Password";
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void printMessage()
	{
		System.out.println(this.message);
	}
}
