package montres;

public class MecanismeAnalogique extends Mecanisme {

	private int date;

	public MecanismeAnalogique(double uneVal, String uneHeure, int uneDate) {
		super(uneVal, uneHeure);
		date = uneDate;
	}
	public MecanismeAnalogique(double uneVal, int uneDate) {
		super(uneVal);
		date = uneDate;
	}
	// Constructeur de copie
	public MecanismeAnalogique(MecanismeAnalogique autre){
		super(autre);
		date = autre.date;
	}
	
	// Copie polymorphique
	@Override
	public MecanismeAnalogique copie(){
		return new MecanismeAnalogique(this);
	}
	
	@Override
	protected String toStringType(){
		return "analogique";
	}
	public String toStringDate(){
		return " date " + date;
	}
	@Override
	protected String toStringCadran(){
		return super.toStringCadran() + ", " + toStringDate();
	}

}
