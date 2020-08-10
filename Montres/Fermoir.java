package montres;

public class Fermoir extends Accessoire {

	public Fermoir(String unNom, double uneValeur) {
		super("Fermoir " + unNom, uneValeur);
	}
	
	public Fermoir(Fermoir autre){
		super(autre);
	}
	
	@Override
	public Fermoir copie(){
		return new Fermoir(this);
	}

}
