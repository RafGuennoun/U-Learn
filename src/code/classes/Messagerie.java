package code.classes;

import java.util.ArrayList;
public class Messagerie {

	private final int numMessagerie;
	private ArrayList<Message> messagesRe�us;
	private ArrayList<Message> messagesEnvoyes;
	
	public Messagerie(int num)
	{
		this.numMessagerie = num;
		messagesRe�us = new ArrayList<Message>();
		messagesEnvoyes = new ArrayList<Message>();
	}

	public ArrayList<Message> getMessagesRe�us() {
		return messagesRe�us;
	}

	public void setMessagesRe�us(ArrayList<Message> messagesRe�us) {
		this.messagesRe�us = messagesRe�us;
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
		messagesRe�us.add(m);
	}
	
	public void ajouterMsgE(Message m)
	{
		messagesEnvoyes.add(m);
	}
	
}
