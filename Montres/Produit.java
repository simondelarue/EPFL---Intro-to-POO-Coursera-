package Java_exercises.Montres;

abstract class Produit {

	private final double valeur;
	
	public Produit(double uneValeur){
		valeur = uneValeur;
	}
	// Surcharge du constructeur pour affecter une valeur par d�faut
	// La valeur d'un produit est initialis�e par d�faut � 0
	public Produit(){
		valeur = 0.0;
	}
	
	// Constructeur de copie
	public Produit(Produit autre){
		valeur = autre.valeur;
	}
	
	// M�thode polymorphique de copie
	public abstract Produit copie();
	
	// M�thode de calcul du prix. Le prix d'un produit sera fonction du type de produit.
	public double prix(){
		return valeur;
	}
	
	@Override
	public String toString(){
		return Double.toString(prix());
	}
}
