package Java_exercises.Montres;

public class MecanismeDouble extends MecanismeAnalogique implements ReveilDigital {

	private String reveil;
	
	public MecanismeDouble(double uneVal, String uneHeure, int uneDate, String unReveil) {
		super(uneVal, uneHeure, uneDate);
		reveil = unReveil;
	}
	public MecanismeDouble(double uneVal, int uneDate, String unReveil) {
		super(uneVal, uneDate);
		reveil = unReveil;
	}

	// Constructeur de copie
	public MecanismeDouble(MecanismeDouble autre){
		super(autre);
		reveil = autre.reveil;
	}
	
	// Copie polymorphique
	@Override
	public MecanismeDouble copie(){
		return new MecanismeDouble(this);
	}
	
	@Override
	protected String toStringType(){
		return "double";
	}
	
	@Override
	protected String toStringCadran(){
		String result = "sur l'�cran : ";
		result += super.toStringCadran();
		result += ", sous les aiguilles : ";
		result += toStringReveil();
		return result;
	}
	
	public String toStringReveil(){
		return " r�veil " + reveil;
	}

}
