package code.classes;

public class Wiki {
	
	private final int numWiki;
	private String nomWiki;
	private String domaineWiki;
	
	public Wiki(String n, String d,int num)
	{
		this.nomWiki = n;
		this.domaineWiki = d;
		this.numWiki = num;
	}

	public int getNumWiki() {
		return numWiki;
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
	
	public void redistribuer()
	{
		
	}

}
