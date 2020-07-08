package Java_exercises.BoiteALettres;

class Colis extends Courrier{

	//attributs sp'ecifiques aux colis:
	protected double volume;

	public Colis(double poids, boolean express, String adresse, double volume) {
		super(poids, express, adresse);
		this.volume = volume;
	}

	// redéfinit affranchirNormal();
	protected double affranchirNormal() {
		// affranchit les colis selon une formule pr'ecise
		return 0.25 * volume + poids/1000.0;
	}

	// ici il faut red'efinir  (sp'ecialiser) la re`gle de validit'e des colis
	// un colis est invalide s' il  a une mauvaise adresse
	//ou depasse un certain volume
	public boolean valide(){
		return (super.valide() && volume <= 50);
	}
	
	@Override
	public String toString() {
		String s = "Colis\n";
		s += super.toString();
		s += "	Volume : " + volume + " litres\n";
		return s;
	}


}