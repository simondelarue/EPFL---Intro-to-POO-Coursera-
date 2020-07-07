package Java_exercises.Voyage;

public class Sejour extends OptionVoyage{
    private int nbNuits;
    private double prixNuit;

    public Sejour(String unNom, double unPrix, int unNbNuits, double unPrixNuit){
        super(unNom, unPrix);
        nbNuits = unNbNuits;
        prixNuit = unPrixNuit;
    }

    public double prix(){
        return ((this.nbNuits * this.prixNuit) + super.prix());
    }
}