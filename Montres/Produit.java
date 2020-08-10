package montres;

abstract class Produit {

	private final double valeur;
	
	public Produit(double uneValeur){
		valeur = uneValeur;
	}
	// Surcharge du constructeur pour affecter une valeur par défaut
	// La valeur d'un produit est initialisée par défaut à 0
	public Produit(){
		valeur = 0.0;
	}
	
	// Constructeur de copie
	public Produit(Produit autre){
		valeur = autre.valeur;
	}
	
	// Méthode polymorphique de copie
	public abstract Produit copie();
	
	// Méthode de calcul du prix. Le prix d'un produit sera fonction du type de produit.
	public double prix(){
		return valeur;
	}
	
	@Override
	public String toString(){
		return Double.toString(prix());
	}
}
