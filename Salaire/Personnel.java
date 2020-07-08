package Java_exercises.Salaire;

public class Personnel {
    
    private Employe[] staff;
    private int nbEmp;
    private final static int MAXEMPLOYE = 200;

    public Personnel(){
        staff = new Employe[MAXEMPLOYE];
        nbEmp = 0; 
    }

    public void ajouterEmploye(Employe e){
        ++ nbEmp;
        if (nbEmp <= MAXEMPLOYE){
            staff[nbEmp - 1] = e;
        } else {
            System.out.println("Pas d'ajout possible");
        }
    }
    public double salaireMoyen(){
        double res = 0.0;
        for (int i=0; i<nbEmp; i++){
            res += staff[i].calculerSalaire();
        }
        return res / nbEmp;
    }
    public void afficherSalaires(){
        for (int i=0; i<nbEmp; i++){
            System.out.println(staff[i].getNom() + " gagne " + staff[i].calculerSalaire() + " EUR");
        }
    }
}