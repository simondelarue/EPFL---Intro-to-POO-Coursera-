package Java_exercises.Course;

public class Vehicule {
	private String nom;
	private double vitesse;
	private int poids;
	private int carburant;
	
	public Vehicule(){
		nom = "Anonyme";
		vitesse = 130.0;
		poids = 1000;
		carburant = 0;
	}
	public Vehicule(String unNom, double uneVit, int unPoids, int unCarb){
		nom = unNom;
		vitesse = uneVit;
		poids = unPoids;
		carburant = unCarb;
	}
	
	public String getNom(){
		return this.nom;
	}
	public double getVitesseMax(){
		return this.vitesse;
	}
	public int getPoids(){
		return this.poids;
	}
	public int getCarburant(){
		return this.carburant;
	}
	
	private double performance(){
		return this.vitesse / this.poids;
	}
	
	public boolean meilleur(Vehicule autreVehicule){
		return (this.performance() > autreVehicule.performance());
	}
	
	@Override
	public String toString(){
		String s = "";
		s += getNom();
		s += " -> vitesse max = ";
		s += getVitesseMax();
		s += " km/h, poids = ";
		s += getPoids();
		s += " kg";
		return s;
	}
}
