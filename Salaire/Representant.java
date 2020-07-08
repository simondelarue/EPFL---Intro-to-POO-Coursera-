package Java_exercises.Salaire;

public class Representant extends Commercial {
    
    private final static double POURCENT_REPRESENTANT = 0.2;
    private final static int BONUS_REPRESENTANT = 800;

    public Representant(String unNom, String unPrenom, int unAge, String uneDate, double unCA){
        super(unNom, unPrenom, unAge, uneDate, unCA);
    }

    // On redéfinit calculerSalaire()
    public double calculerSalaire(){
        return super.getCA() * POURCENT_REPRESENTANT + BONUS_REPRESENTANT;
    }

    public String getTitre(){
        return "Le représentant ";
    }    
}