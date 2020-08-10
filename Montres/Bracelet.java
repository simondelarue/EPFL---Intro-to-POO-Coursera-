package montres;

public class Bracelet extends Accessoire {

	public Bracelet(String unNom, double uneValeur) {
		super("Bracelet " + unNom, uneValeur);
		// TODO Auto-generated constructor stub
	}
	
	public Bracelet(Bracelet autre){
		super(autre);
	}
	
	@Override
	public Bracelet copie(){
		return new Bracelet(this);
	}

}
