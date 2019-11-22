package code.classes;
import java.awt.image.*;
public abstract class Utilisateur {
	
	protected String id;
	protected String nom;
	protected String prenom;
	protected String email;
	protected Date dateNaissance;
	protected Messagerie messagerie;
	protected String photo;
	protected byte[] photoAficher;
	
	
	public Utilisateur(String id,String nom, String prenom, String email, Date d, String pdp)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = d;
		this.photo = pdp;
		this.messagerie = new Messagerie();
	}

	public Utilisateur(String id,String nom, String prenom, String email, Date d,byte[] pdp)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = d;
		this.photoAficher = pdp;
		this.messagerie = new Messagerie();
	}
	
	public byte[] getPhotoAficher() {
		return photoAficher;
	}

	public void setPhotoAficher(byte[] photoAficher) {
		this.photoAficher = photoAficher;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void recevoirMessage(Message m)
	{
		this.messagerie.ajouterMsgR(m);
	}
	
	public void envoyerMessage(Utilisateur u, Message m)
	{
		u.recevoirMessage(m);
		this.messagerie.ajouterMsgE(m);
	}
	
	public Messagerie getMessagerie() {
		return messagerie;
	}

	public void setMessagerie(Messagerie messagerie) {
		this.messagerie = messagerie;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
