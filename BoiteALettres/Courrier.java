package Java_exercises.BoiteALettres;

abstract class Courrier{
	// retourne le montant n'ecessaire pour affranchir le courrier
	// en mode d'exp'edition normal
	
	// calcul du cout de l'affranchissement en tarif normal
	abstract protected double affranchirNormal();
	
	// les attributs (communs aux lettres et colis):
	protected double poids;
	protected boolean express;
	protected String adresse;

	// un constructeur possible pour la classe
	public Courrier(double poids, boolean express, String adresse) {
		this.poids = poids;
		this.express = express;
		this.adresse = adresse;
	}

	// retourne le montant n'ecessaire pour affranchir le courrier.
	// elle appelle affranchirNormal et retourne le double de ce montant
	// si le mode d'exp'edition est  express ('eviter la duplication du code
	// qui double le montant dans les m'ethodes affranchir-normal
	// des sous-classes)
	public double affranchir() {
		if (! valide())
		{
			return 0;
		}
		else
		{
			double total = affranchirNormal();
			if (express) {
				total *= 2;
			}
			return total;
		}
	}

	// un courrier est invalide si l'adresse de destination est vide
	// methode utilis'ee par Boite::affranchir et
	// Boite::courriersInvalides
	public boolean valide() {
		return adresse.length() > 0;
	}
	
	@Override
	public String toString() {
		String s = "";
		if (!valide())
		{
			s+= "(Courrier  invalide)\n";
		}
		s+= "	Poids : " + poids + " grammes\n";
		s+= "	Express : " + (express ? "oui" : "non") + "\n";
		s+= "	Destination : " + adresse + "\n";
		s+= "	Prix : " + affranchir() + " CHF\n";
		return s;
	}

}