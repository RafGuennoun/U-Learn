package code.classes;

import java.util.ArrayList;

public class Wiki {
	
	private int numWiki;
	private String nomWiki;
	private String domaineWiki;
	private String createur;
	private String textWiki;
	private ArrayList<String> images;
	private ArrayList<byte[]> imageAfficher;
	
	public Wiki(int num,String n, String d,String t, String c)
	{
		this.nomWiki = n;
		this.domaineWiki = d;
		this.numWiki = num;
		this.textWiki = t;
		this.createur = c;
		
		this.images = new ArrayList<String>();
		this.imageAfficher = new ArrayList<byte[]>();
	}

	public String getTextWiki() {
		return textWiki;
	}

	public void setTextWiki(String textWiki) {
		this.textWiki = textWiki;
	}

	public int getNumWiki() {
		return numWiki;
	}


	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public ArrayList<byte[]> getImageAfficher() {
		return imageAfficher;
	}

	public void setImageAfficher(ArrayList<byte[]> imageAfficher) {
		this.imageAfficher = imageAfficher;
	}

	public void setNumWiki(int numWiki) {
		this.numWiki = numWiki;
	}

	public String getNomWiki() {
		return nomWiki;
	}

	public void setNomWiki(String nomWiki) {
		this.nomWiki = nomWiki;
	}

	public String getDomaineWiki() {
		return domaineWiki;
	}

	public void setDomaineWiki(String domaineWiki) {
		this.domaineWiki = domaineWiki;
	}
	
	public void ajouterImage(String image)
	{
		this.images.add(image);
	}
	
	public void ajouterImageAfficher(byte[] imageA)
	{
		this.imageAfficher.add(imageA);
	}

}
