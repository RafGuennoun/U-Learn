package code.classes;
import java.util.Calendar;
public class Date {

	private int annee;
	private int mois;
	private int jour;
	
	public Date(int a,int m,int j)
	{
		this.annee = a;
		this.mois = m;
		this.jour = j;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public String toString()
	{
		return(annee + "-" + mois + "-" + jour);
	}
	
	public java.sql.Date dateToSql()
	{
		return java.sql.Date.valueOf(this.toString());
	}
	
	public static Date sqlToDate(java.sql.Date d0)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(d0);
		
		int jour = cal.get(Calendar.DAY_OF_MONTH);
		int mois = cal.get(Calendar.MONTH)+1;
		int annee = cal.get(Calendar.YEAR);
		
		return new Date(annee,mois,jour);
	}
}
