package code.classes;

import java.util.ArrayList;
public class Blog {

	private final int numBlog;
	private String NomBlog;
	private String textBlog;
	private Date dateBlog;
	private String createur;
	private ArrayList<String> photos;
	private ArrayList<byte[]> photosAfficher;
	

	
	public Blog(int numBlog, String nomBlog, String text, Date d, String createur)
	{
		this.numBlog = numBlog;
		this.NomBlog = nomBlog;
		this.textBlog = text;
		this.dateBlog = d;
		this.createur = createur;
		this.photos = new ArrayList<String>();
		this.photosAfficher = new ArrayList<byte[]>();
	}
	
	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public Date getDateBlog() {
		return dateBlog;
	}
	public void setDateBlog(Date dateBlog) {
		this.dateBlog = dateBlog;
	}
	public ArrayList<byte[]> getPhotosAfficher() {
		return photosAfficher;
	}
	public void setPhotosAfficher(ArrayList<byte[]> photosAfficher) {
		this.photosAfficher = photosAfficher;
	}
	public ArrayList<String> getPhotos() {
		return photos;
	}
	public String getTextBlog() {
		return textBlog;
	}
	public void setTextBlog(String text) {
		this.textBlog = text;
	}
	public String getNomBlog() {
		return NomBlog;
	}
	public void setNomBlog(String nomBlog) {
		NomBlog = nomBlog;
	}
	public int getNumBlog() {
		return numBlog;
	}
	public void setPhotos(ArrayList<String> photos) {
		this.photos = photos;
	}
	
	
}
