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
	
	/*************************************************************************************************************************************************************/
	/*************************************************************************************************************************************************************/
	/*************************************************************************************************************************************************************/
	/*************************************************************************************************************************************************************/
	
	public boolean anneeBis(int a)
	{
		if( a%4==0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public boolean anneeExiste( int a)
	{
		if( a<1930 || a>2019 )
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean testDate(int j,int m,int a)
	{
		if ( anneeExiste(a)==false)
		{
			return false;
		}
		
		if( j<1 || j>31 )
		{
			return false;
		}
		
		if( m<1 || m>12)
		{
			return false;	
		}
		
		if( (j==30 && m==2) || ( j==31 && m==2 ) )
		{
			return false;
		}
		
		if( (j==31 && m==4) || (j==31 && m==6) || (j==31 && m==9) || (j==31 && m==11) )
		{
			return false;
		}
		
		if ( j==29 && m==2 && anneeBis(a)==false )
		{
			return false;
		}
		
		
		return true;
	}
/*	
	public boolean alphabet(char c)
	{
		boolean v=false;
		char a='a'; 
		char A='A';
		while( (a<='z') && (v==false) )
		{
			if(c==a)
			{
				v=true;
			}
			a++;
		}
		while( (A<='Z') && (v==false) )
		{
			if(c==A)
			{
				v=true;
			}
			A++;
		}
		return v;
	}
*/
	public boolean num(char c)
	{
		boolean v=false;
		char i='0'; 
		while( (i<='9') && (v==false) )
		{
			if(c==i)
			{
				v=true;
			}
			i++;
		}
		return v;
	}

/*	
	public boolean textOnly(String s)
	{
		for(int i=0; i<s.length();i++)
		{
			if( !alphabet(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
*/
	
	public boolean numbersOnly(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if( !num(s.charAt(i)) )
			{
				return false;
			}
		}
		return true;
	}
	
}
