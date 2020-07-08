package Java_exercises.Salaire;

public class Vendeur extends Commercial {
    
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 400;

    public Vendeur(String unNom, String unPrenom, int unAge, String uneDate, double unCA){
        super(unNom, unPrenom, unAge, uneDate, unCA);
    }

    // On redéfinit calculerSalaire()
    public double calculerSalaire(){
        return super.getCA() * POURCENT_VENDEUR + BONUS_VENDEUR;
    }

    public String getTitre(){
        return "Le vendeur ";
    }
}