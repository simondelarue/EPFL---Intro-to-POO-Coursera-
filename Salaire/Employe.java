package Java_exercises.Salaire;

abstract class Employe {

    // Le salaire dépend du type d'employé
    public abstract double calculerSalaire();

    private String nom;
    private String prenom;
    private int age;
    private String dateArrivee;

    public Employe(String unNom, String unPrenom, int unAge, String uneDate){
        nom = unNom;
        prenom = unPrenom;
        age = unAge;
        dateArrivee = uneDate;
    }

    public String getTitre(){
        return "L'employé ";
    }

    public String getNom(){
        return getTitre() + prenom + " " + nom;
    } 
}