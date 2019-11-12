package code.classes;

public enum Difficulte {
	
	FACILE("facile"),
	MOYEN("moyen"),
	DIFFICILE("difficile");
	
	String desc;
	
	private Difficulte(String desc)
	{
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
