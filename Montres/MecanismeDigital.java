package montres;

public class MecanismeDigital extends Mecanisme implements ReveilDigital  {

	private String reveil;
	
	public MecanismeDigital(double uneVal, String uneHeure, String unReveil) {
		super(uneVal, uneHeure);
		reveil = unReveil;
	}
	// Constructeur de copie
	public MecanismeDigital(MecanismeDigital autre){
		super(autre);
		reveil = autre.reveil;
	}
	
	// Copie polymorphique
	@Override
	public MecanismeDigital copie(){
		return new MecanismeDigital(this);
	}

	@Override
	protected String toStringType(){
		return "digital";
	}
	
	public String toStringReveil(){
		return " réveil " + reveil;
	}
	@Override
	protected String toStringCadran(){
		return super.toStringCadran() + ", " + toStringReveil();
	}

}
