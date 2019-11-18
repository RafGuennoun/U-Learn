package code.classes;

import java.util.ArrayList;
public class Blog {

	private final int numBlog;
	private String NomBlog;
	private ArrayList<String> photos;
	

	
	public Blog(int numBlog, String nomBlog)
	{
		this.numBlog = numBlog;
		this.NomBlog = nomBlog;
		this.photos = new ArrayList<String>();
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
