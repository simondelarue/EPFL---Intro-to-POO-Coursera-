package Java_exercises.Salaire;

public class ManutARisque extends Manutentionnaire implements ARisque {
    
    public ManutARisque(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date, heures);
    }

    // Redéfinition de calculerSalaire
    public double calculerSalaire(){
        return super.calculerSalaire() + ARisque.PRIME;
    }
}