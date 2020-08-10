package Java_exercises.Montres;

public class Vitre extends Accessoire {

	public Vitre(String unNom, double uneValeur) {
		super("Vitre " + unNom, uneValeur);
		// TODO Auto-generated constructor stub
	}
	
	public Vitre(Vitre autre){
		super(autre);
	}
	
	@Override
	public Vitre copie(){
		return new Vitre(this);
	}

}
