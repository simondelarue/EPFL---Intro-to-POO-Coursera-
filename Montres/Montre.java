package Java_exercises.Montres;

import java.util.ArrayList;

public class Montre extends Produit {

	// Une montre poss�de un m�canisme et des accessoires
	private Mecanisme coeur;
	private ArrayList<Accessoire> accessoires;
	
	// Constructeur par d�faut pour initialiser la liste d'accessoires
	public Montre(Mecanisme depart) {
		coeur = depart.copie();
		accessoires = new ArrayList<Accessoire>();
	}
	
	// Constructeur de copie (copie de surface)
	/*
	public Montre(Montre autreMontre){
		this.coeur = autreMontre.coeur;
		this.accessoires = autreMontre.accessoires;
	}
	*/
	
	// Constructeur de copie (copie profonde)
	public Montre(Montre autreMontre){
		super(autreMontre);
		coeur = autreMontre.coeur.copie();
		accessoires = new ArrayList<Accessoire>();
		for (Accessoire acc : autreMontre.accessoires){
			accessoires.add(acc.copie());
		}
	}
	
	@Override
	public Montre copie(){
		return new Montre(this);
	}

	// Methode permettant d'ajouter un accessoire � une montre
	public void ajouterAccessoire(Accessoire acc){
		accessoires.add(acc.copie());
	}
	
	// Calcul du prix d'une montre (= somme des prix des accessoires + prix du m�canisme + prix de base)
	@Override
	public double prix(){
		double res = super.prix() + coeur.prix();
		for (Accessoire a : accessoires){
			res += a.prix();
		}
		return res;
	}
	
	public void afficher(){
		System.out.println("Une montre compos�e de : ");
		System.out.println(" * " + coeur);
		for (Accessoire a : accessoires){
			System.out.println(" * " + a);
		}
		System.out.println("==> Prix total : " + String.format("%.1f", prix()));
		System.out.println();
	}
}
