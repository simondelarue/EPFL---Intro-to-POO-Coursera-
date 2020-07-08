package Java_exercises.BoiteALettres;

public class ColisCommercial extends Colis implements Commercial{

	public ColisCommercial(double poids, boolean express, String adresse, double volume) {
		super(poids, express, adresse, volume);
    }
    
    // Redéfinit deduction()
    public double deduction(){
        return 0.15;
    }

    // redéfinit affranchir()
    
    @Override
	public double affranchir() {
        double montant =  super.affranchir();
        montant -= montant * deduction();
        return montant;
    }

    // Redéfinit toString()
    @Override
	public String toString() {
        String s = "";
        s += super.toString();
        s += "	Colis commercial\n";
        return s;
    }
}