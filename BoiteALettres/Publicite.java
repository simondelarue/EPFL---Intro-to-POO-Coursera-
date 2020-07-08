package Java_exercises.BoiteALettres;

class Publicite extends Courrier implements Commercial{

	public Publicite(double poids, boolean express, String adresse){
		super(poids, express, adresse);
	}

	// redéfinit affranchirNormal()
	protected double affranchirNormal() {
		return poids/1000.0 * 5.0;
    }
    
    // redéfinit deduction()
	public double deduction() {
		return 0.2;
    }
    // redéfinit affranchir()
    
    @Override
	public double affranchir() {
        double montant =  super.affranchir();
        montant -= montant * deduction();
        return montant;
    }
    


	// inutile de red'efinir la méthode valide() pour les  publicités

	@Override
	public String toString() {
		String s = "Publicité\n";
		s += super.toString();
		return s;
	}
	
}