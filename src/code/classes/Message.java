package code.classes;

public class Message {

	private final int numMsg;
	private String message;
	private Date dateEnvoi;
	
	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public Message(int numMsg, String message)
	{
		this.numMsg = numMsg;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNumMsg() {
		return numMsg;
	}
	
	
}
