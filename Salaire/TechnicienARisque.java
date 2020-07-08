package Java_exercises.Salaire;

public class TechnicienARisque extends Technicien implements ARisque {
    
    public TechnicienARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }

    // Redéfinition de calculerSalaire
    public double calculerSalaire(){
        return super.calculerSalaire() + ARisque.PRIME;
    }
}