package code.classes;

import java.util.ArrayList;
public class Blog {

	private final int numBlog;
	private String NomBlog;
	private String textBlog;
	private ArrayList<String> photos;
	

	
	public Blog(int numBlog, String nomBlog, String text)
	{
		this.numBlog = numBlog;
		this.NomBlog = nomBlog;
		this.textBlog = text;
		this.photos = new ArrayList<String>();
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
