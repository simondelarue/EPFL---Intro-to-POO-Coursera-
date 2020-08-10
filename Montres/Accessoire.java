package Java_exercises.Montres;

abstract class Accessoire extends Produit {

	private final String nom;
	
	public Accessoire(String unNom, double uneValeur) {
		super(uneValeur);
		nom = unNom;
	}
	
	public Accessoire(Accessoire autre){
		super(autre);
		nom = autre.nom;
	}
	
	// Copie polymorphique
	public abstract Accessoire copie();
	
	@Override
	public String toString(){
		String res = nom + " co�tant ";
		res += super.toString();
		return res;
	}

}
