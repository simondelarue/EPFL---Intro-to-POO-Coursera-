package Java_exercises.Montres;

public class Boitier extends Accessoire {

	public Boitier(String unNom, double uneValeur) {
		super("Boitier " + unNom, uneValeur);
		// TODO Auto-generated constructor stub
	}

	public Boitier(Boitier autre){
		super(autre);
	}
	
	@Override
	public Boitier copie(){
		return new Boitier(this);
	}
}
