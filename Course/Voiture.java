package Java_exercises.Course;

public class Voiture extends Vehicule {
	private String categorie;
	
	public Voiture(String unNom, double uneVit, int unPoids, int unCarb, String uneCat){
		super(unNom, uneVit, unPoids, unCarb);
		categorie = uneCat;
	}
	
	public String getCategorie(){
		return this.categorie;
	}
	
	public String toString(){
		return (super.toString() + ", Voiture de " + this.getCategorie()); 
	}
}
