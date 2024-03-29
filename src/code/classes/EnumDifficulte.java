package code.classes;

public enum EnumDifficulte {
	
	FACILE("Facile"),
	MOYEN("Moyen"),
	DIFFICILE("Difficile");
	
	String desc;
	
	private EnumDifficulte(String desc)
	{
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
	public static EnumDifficulte transform(String d)
	{
		if(d==FACILE.getDesc())
			return FACILE;
		else if(d==MOYEN.getDesc())
			return MOYEN;
		else
			return DIFFICILE;
	}
}
