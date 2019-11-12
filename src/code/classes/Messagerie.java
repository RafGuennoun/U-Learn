package code.classes;

import java.util.ArrayList;
public class Messagerie {

	private final int numMessagerie;
	private ArrayList<Message> messagesReçus;
	private ArrayList<Message> messagesEnvoyes;
	
	public Messagerie(int num)
	{
		this.numMessagerie = num;
		messagesReçus = new ArrayList<Message>();
		messagesEnvoyes = new ArrayList<Message>();
	}

	public ArrayList<Message> getMessagesReçus() {
		return messagesReçus;
	}

	public void setMessagesReçus(ArrayList<Message> messagesReçus) {
		this.messagesReçus = messagesReçus;
	}

	public ArrayList<Message> getMessagesEnvoyes() {
		return messagesEnvoyes;
	}

	public void setMessagesEnvoyes(ArrayList<Message> messagesEnvoyes) {
		this.messagesEnvoyes = messagesEnvoyes;
	}

	public int getNumMessagerie() {
		return numMessagerie;
	}
	
	public void ajouterMsgR(Message m)
	{
		messagesReçus.add(m);
	}
	
	public void ajouterMsgE(Message m)
	{
		messagesEnvoyes.add(m);
	}
	
}
