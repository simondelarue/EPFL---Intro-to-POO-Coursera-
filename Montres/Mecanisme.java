package Java_exercises.Montres;

abstract class Mecanisme extends Produit {
	
	private String heure;

	public Mecanisme(double uneVal, String uneHeure) {
		super(uneVal);
		heure = uneHeure;
	}
	
	public Mecanisme(double uneVal) {
		super(uneVal);
		heure = "12:00";
	}
	
	// Constructeur de copie
	public Mecanisme(Mecanisme autre){
		super(autre);
		heure = autre.heure;
	}
	
	// Copie polymorphique de mecanisme
	public abstract Mecanisme copie();
	
	protected String toStringCadran(){
		return heure;
	}
	
	protected abstract String toStringType();
	
	public final String toString(){
		String result = "m�canisme ";
		result += toStringType();
		result += " (affichage : ";
		result += toStringCadran();
		result += "), prix : ";
		result += super.toString();
		return result;
	}

}
