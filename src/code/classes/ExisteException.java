package code.classes;

public class ExisteException extends Exception{
	
	public String message;
	
	public ExisteException(int x)
	{
		if(x==1)
		{			
			this.message = "Username already existes";
		}
		else
		{
			this.message = "Username doesn't existe";
		}
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
